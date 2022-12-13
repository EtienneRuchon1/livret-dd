package toto;

import java.io.IOException;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Hello world!
 *
 */
public class DesicionServiceExecution {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String endPointURI = "http://localhost:9090/DecisionService/rest/v1/Configuration_Deploiement_Interet_Sur_Developpement_Durable/OD_Interet_Sur_Developpement_Durable";


		// Définition de la transaction et du compte épargne

		String transaction = "{\"compteEpargne\": {" 
				+ "\"solde\": \"10517320\"," 
				+ "\"interets\": [10517320]" 
				+ "},"
				+ "\"transaction\": {" 
				+ "\"date\": \"06/09/2010\","
				+ "\"dateDeLaTransactionPrecedente\": \"06/09/2010\"," 
				+ "\"montant\": 10517320,"
				+ "\"montantPrecedent\": 10517320" + "}" + "}";

		System.out.println(transaction);

		CloseableHttpClient client = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(endPointURI);
			httpPost.setHeader("Content-Type", "application/json");
			httpPost.setEntity(new StringEntity(transaction));
		    
			CloseableHttpResponse response = client.execute(httpPost);
			try {
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					System.err.println("Status Code: " + response.getStatusLine().getStatusCode());
					System.err.println("Status Line: " + response.getStatusLine());
					String responseEntity = EntityUtils.toString(response.getEntity());
					System.err.println("Response Entity: " + responseEntity);

					/*throw new RuntimeException("An error occurred when invoking Decision Service at: " + endPointURI
							+ "\n" + response.getStatusLine() + ": " + responseEntity);
				*/
				} else {
					String result = EntityUtils.toString(response.getEntity());
					System.out.println("Result: " + result);
				}
			} finally {
				if (response != null) {
					response.close();
				}
			}
		} finally {
			client.close();
		}

	}

}
