package pn.src;

import java.util.List;
import java.util.ArrayList;

public class Demande {
private String depart;
private String arrivee;
private int nbCorresMax;
private double budgetMax;
private int classeMin;
private List<Passager> passagers = new ArrayList<pn.src.Passager>();
	
	public Demande() {
		super();
	}

	public Demande(String dep, String arriv, int corMax, double coutMax,
			int classeMin, List<Passager> pass) {
		super();
		this.depart = dep;
		this.arrivee = arriv;
		this.nbCorresMax = corMax;
		this.budgetMax = coutMax;
		this.classeMin = classeMin;
		if (pass != null)
			this.passagers = pass;
	}

	public int getNbCorresMax() {
		return nbCorresMax;
	}

	public void setNbCorresMax(int cMax) {
		this.nbCorresMax = cMax;
	}

	public double getBudgetMax() {
		return budgetMax;
	}

	public void setBudgetMax(double coutMax) {
		this.budgetMax = coutMax;
	}

	public int getClasseMin() {
		return classeMin;
	}

	public void setClasseMin(int classeMin) {
		this.classeMin = classeMin;
	}
	
	public List<Passager> getPassagers() {
		return passagers;
	}
	
	public void setPassagers(List<Passager> passagers) {
		this.passagers = passagers;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getArrivee() {
		return arrivee;
	}

	public void setArrivee(String arrivee) {
		this.arrivee = arrivee;
	}



	
}

