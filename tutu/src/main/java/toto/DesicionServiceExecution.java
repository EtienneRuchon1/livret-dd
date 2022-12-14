package toto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.javatuples.Pair;

/**
 * Hello world!
 *
 */
public class DesicionServiceExecution {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		List<Pair<String, Double>> transactions = new ArrayList<>();

		Pair<String, Double> souscription = new Pair<>("02/06/2009", 6000.0);
		Pair<String, Double> debit1 = new Pair<>("16/11/2009", -2000.0);
		Pair<String, Double> credit1 = new Pair<>("17/11/2009", 1000.0);
		Pair<String, Double> debit2 = new Pair<>("14/12/2009", -500.0);
		Pair<String, Double> versementInteret = new Pair<>("31/12/2009", 41.77);
		Pair<String, Double> finSimulation = new Pair<>("15/05/2010", 0.0);

		transactions.add(souscription);
		transactions.add(debit1);
		transactions.add(credit1);
		transactions.add(debit2);
		transactions.add(versementInteret);
		transactions.add(finSimulation);

		CloseableHttpClient client = HttpClients.createDefault();
		String endPointURI = "http://localhost:9090/DecisionService/rest/v1/Configuration_Deploiement_Interet_Sur_Developpement_Durable/OD_Interet_Sur_Developpement_Durable";
		String requete = "";
		String result = "";
		for (int i = 0; i < transactions.size(); i++) {

			if (i == 0) {
				requete = Utilitaire.creerRequete(transactions.get(i).getValue0(), transactions.get(i).getValue1(),
						transactions.get(i).getValue0(), 0.0);
			} else {
				requete = Utilitaire.creerRequete(transactions.get(i).getValue0(), transactions.get(i).getValue1(),
						transactions.get(i - 1).getValue0(), transactions.get(i - 1).getValue1(), result);
			}

			try {
				HttpPost httpPost = new HttpPost(endPointURI);
				httpPost.setHeader("Content-Type", "application/json");
				httpPost.setEntity(new StringEntity(requete));

				CloseableHttpResponse response = client.execute(httpPost);
				try {
					if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
						System.err.println("Status Code: " + response.getStatusLine().getStatusCode());
						System.err.println("Status Line: " + response.getStatusLine());
						String responseEntity = EntityUtils.toString(response.getEntity());
						System.err.println("Response Entity: " + responseEntity);

					} else {
						result = EntityUtils.toString(response.getEntity());

					}
				} finally {
					if (response != null) {
						response.close();
					}
				}
			} finally {

			}
		}
		System.out.println(result);
		client.close();

	}

}