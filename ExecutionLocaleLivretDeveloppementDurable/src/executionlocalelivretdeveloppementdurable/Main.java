//      -----------------------------------------------------------------------
//      Licensed Materials - Property of IBM
//      IBM Decision Server
//      (c) Copyright IBM Corporation 1987, 2022. All Rights Reserved.
//      RuleApp: Configuration_Deploiement_Interet_Sur_Developpement_Durable
//      Date: 6 déc. 2022 à 14:52:38
//      Generated by: Decision Server 8.10.2.0
//
//      N O T I C E
//
//      Changes to this file will be lost if the code is regenerated.
//      Note to U.S. Government Users Restricted Rights: 
//      Use, duplication or disclosure restricted by GSA ADP Schedule 
//      Contract with IBM Corp.
//     -----------------------------------------------------------------------

package executionlocalelivretdeveloppementdurable;

import executionlocalelivretdeveloppementdurable.invocation.ODInteretSurDeveloppementDurableExecution;

/**
 * Point d'entrée de l'application
 */
public class Main {

	/**
	 * L'exécution démarre ici...
	 */
	public static void main(String[] args) throws Exception {

		ODInteretSurDeveloppementDurableExecution OD_Interet_Sur_Developpement_Durable = new ODInteretSurDeveloppementDurableExecution();

		/* Souscription */

		pn.CompteEpargne compteEpargne = new pn.CompteEpargne(0, null);
		OD_Interet_Sur_Developpement_Durable.setCompteEpargne(compteEpargne);

		// ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		// pn.Transaction sourscription = new pn.Transaction("02/06/2009", "16/08/2009",
		// 6000.0, 0.0);
		pn.Transaction transaction1 = new pn.Transaction("02/06/2009", "02/06/2009", 6000.0, 6000.0); // La souscription
		pn.Transaction transaction2 = new pn.Transaction("16/11/2009", "02/06/2009", -2000.0, 6000.0);
		pn.Transaction transaction3 = new pn.Transaction("17/11/2009", "16/11/2009", 1000.0, -2000.0);
		pn.Transaction transaction4 = new pn.Transaction("14/12/2009", "17/11/2009", -500.0, 1000.0);
		pn.Transaction transaction5 = new pn.Transaction("31/12/2009", "14/12/2009", 41.77, -500.0); // Versement des
																										// intérêts à la
																										// fin de
																										// l'année
		pn.Transaction transaction6 = new pn.Transaction("15/05/2010", "31/12/2009", 0, 41.77); // Fin de simulation

		OD_Interet_Sur_Developpement_Durable.setTransaction(transaction1);

		OD_Interet_Sur_Developpement_Durable.run();

		OD_Interet_Sur_Developpement_Durable.setTransaction(transaction2);

		OD_Interet_Sur_Developpement_Durable.run();
		OD_Interet_Sur_Developpement_Durable.setTransaction(transaction3);

		OD_Interet_Sur_Developpement_Durable.run();

		OD_Interet_Sur_Developpement_Durable.setTransaction(transaction4);

		OD_Interet_Sur_Developpement_Durable.run();

		OD_Interet_Sur_Developpement_Durable.setTransaction(transaction5);

		OD_Interet_Sur_Developpement_Durable.run();

		OD_Interet_Sur_Developpement_Durable.setTransaction(transaction6);

		OD_Interet_Sur_Developpement_Durable.run();

		System.out.println(compteEpargne.resumeCompteEpargne());

	}

}
