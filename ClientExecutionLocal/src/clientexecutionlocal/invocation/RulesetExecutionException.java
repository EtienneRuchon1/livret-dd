//      -----------------------------------------------------------------------
//      Licensed Materials - Property of IBM
//      IBM Decision Server
//      (c) Copyright IBM Corporation 1987, 2022. All Rights Reserved.
//      RuleApp: Configuration_deploiemnet_agence_voyage
//      Date: 30 nov. 2022 à 14:21:50
//      Generated by: Decision Server 8.10.2.0
//
//      N O T I C E
//
//      Changes to this file will be lost if the code is regenerated.
//      Note to U.S. Government Users Restricted Rights: 
//      Use, duplication or disclosure restricted by GSA ADP Schedule 
//      Contract with IBM Corp.
//     -----------------------------------------------------------------------

package clientexecutionlocal.invocation;

/**
 * Se produit en cas d'échec d'un appel d'ensemble de règles
 */
public class RulesetExecutionException extends Exception {
	private static final long serialVersionUID = 1L;
	private String rulesetName;
	private Throwable cause;

	/**
	 * Se produit en cas d'échec d'un appel d'ensemble de règles
	 */
	public RulesetExecutionException(String rulesetName, Throwable cause) {
		this.rulesetName = rulesetName;
		this.cause = cause;
	}

	/**
	 * Renvoie la cause de l'exception
	 */
	public Throwable getCause() {
		return cause;
	}

	/**
	 * Renvoie le nom de l'ensemble de règles
	 */
	public String getRulesetName() {
		return rulesetName;
	}
}
