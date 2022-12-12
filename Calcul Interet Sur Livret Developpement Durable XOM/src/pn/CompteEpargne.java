package pn;

import java.util.ArrayList;
import java.util.List;

public class CompteEpargne {

	double solde;
	List<Double> interets = new ArrayList<Double>();

	public CompteEpargne() {
		super();
		// TODO Module de remplacement de constructeur auto-généré
	}

	public CompteEpargne(double solde, List<Double> interets) {
		super();
		this.solde = solde;
		this.interets = interets;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Double> getInterets() {
		return interets;
	}

	public void setInterets(List<Double> interets) {
		this.interets = interets;
	}

	public String resumeCompteEpargne() {
		return "**** " + "le solde du compte épargne est ==> " + this.getSolde() + "\n" +
				"les intérêts du compte épargne sont ===> " + this.getInterets() + "****";
	}

}
