package executionlocaleassurance;

import executionlocaleassurance.invocation.ODAssuranceExecution;
import pn.EnsembleCotisation;

/**
 * Point d'entrée de l'application
 */
public class Main {

	/**
	 * L'exécution démarre ici...
	 */
	public static void main(String[] args) throws Exception {

		ODAssuranceExecution OD_Assurance = new ODAssuranceExecution();
		pn.Contrat contrat = new pn.Contrat(0.8, 1.1, "B1", 200.0, null, 0.03, 1.00200, 0.970, 2020);
		pn.Garantie g1 = new pn.Garantie("Déteriorations Immobilières","029");
		contrat.getGaranties().add(g1);
		OD_Assurance.setContrat(contrat);
		// TODO insérez votre code pour initialiser 'ensembeCotisation'
		EnsembleCotisation cotisations = new EnsembleCotisation();
		OD_Assurance.setEnsembeCotisation(cotisations);

		// Cette méthode appelle l'ensemble de règles 'OD_Assurance'
		OD_Assurance.run();

		
		// TODO insérez votre code pour traiter la réponse
		System.out.println(cotisations.resumeCotisation());

	}

}
