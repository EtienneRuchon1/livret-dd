package pn;

import java.util.ArrayList;
import java.util.List;

public class Contrat {
	private List<Garantie> garanties = new ArrayList<Garantie>();
	private double surface;
	private String codeBranche;
	private double coefficientVol;
	private double coefficientCommercial;
	private double codeButoir;
	private int exerciceTarification;

	public Contrat() {

	}

	public Contrat(double coefficientCommercial, double coefficientVol, String codeBranche, double surface,
			List<Garantie> garanties, double codeButoir, double coefficientSociete, double coefficientBonus,
			int exerciceTarification) {
		this.coefficientCommercial = coefficientCommercial;
		this.coefficientVol = coefficientVol;
		this.codeBranche = codeBranche;
		this.surface = surface;
		if (garanties != null)
			this.garanties = garanties;
		this.codeButoir = codeButoir;
		this.exerciceTarification = exerciceTarification;

	}

	public List<Garantie> getGaranties() {
		return garanties;
	}

	public void setGaranties(List<Garantie> garanties) {
		this.garanties = garanties;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public double getcoefficientVol() {
		return coefficientVol;
	}

	public void setcoefficientVol(double coefficientVol) {
		this.coefficientVol = coefficientVol;
	}

	public String getCodeBranche() {
		return codeBranche;
	}

	public void setCodeBranche(String codeBranche) {
		this.codeBranche = codeBranche;
	}

	public double getcoefficientCommercial() {
		return coefficientCommercial;
	}

	public void setcoefficientCommercial(double coefficientCommercial) {
		this.coefficientCommercial = coefficientCommercial;
	}

	public double getCodeButoir() {
		return codeButoir;
	}

	public void setCodeButoir(double codeButoir) {
		this.codeButoir = codeButoir;
	}

	public int getExerciceTarification() {
		return exerciceTarification;
	}

	public void setExerciceTarification(int exerciceTarification) {
		this.exerciceTarification = exerciceTarification;
	}

}
