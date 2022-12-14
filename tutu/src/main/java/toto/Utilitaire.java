package toto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utilitaire {

	public static String creerRequete(String date, double montant, String dateDeLaTransactionPrecedente,
			double montantPrecedent) {
		return "{\"compteEpargne\": {" + "\"solde\": 0.0," + "\"interets\": null" + "}," + "\"transaction\": {"
				+ "\"date\":" + " " + "\"" + date + "\"," + "\"dateDeLaTransactionPrecedente\":" + " " + "\""
				+ dateDeLaTransactionPrecedente + "\"," + "\"montant\":" + " " + montant + "," + "\"montantPrecedent\":"
				+ " " + montantPrecedent + "}" + "}";

	}

	public static String creerRequete(String date, double montant, String dateDeLaTransactionPrecedente,
			double montantPrecedent, String reponse) {
		return getCompteEpargne(reponse) + "\"transaction\": {" + "\"date\":" + " " + "\"" + date + "\","
				+ "\"dateDeLaTransactionPrecedente\":" + " " + "\"" + dateDeLaTransactionPrecedente + "\","
				+ "\"montant\":" + " " + montant + "," + "\"montantPrecedent\":" + " " + montantPrecedent + "}" + "}";

	}

	public static String getCompteEpargne(String reponse) {
		final ObjectMapper mapper = new ObjectMapper();
		try {
			Map<String, Object> map = new HashMap<String, Object>();

			map = mapper.readValue(reponse, new TypeReference<HashMap<String, Object>>() {
			});

			List<String> soldeEtInterets = recupereValeursCompteEpargne(map.get("compteEpargne").toString());
			return "{\"compteEpargne\": {" + "\"solde\":" + " " + soldeEtInterets.get(0) + "," + "\"interets\":" + " "
					+ soldeEtInterets.get(1)+"]" + "},";

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static List<String> recupereValeursCompteEpargne(String compteEpargne) {
		List<String> stringArray = new ArrayList<>();
		String[] mots = compteEpargne.split(",");

		String solde = mots[0].split("=")[1];
		String interets = mots[1].split("=")[1].split("}")[0];
		stringArray.add(solde);
		stringArray.add(interets);
		return stringArray;

	}

	public static void main(String args[]) {

	}

}