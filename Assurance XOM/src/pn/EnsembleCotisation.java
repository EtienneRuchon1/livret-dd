package pn;


public class EnsembleCotisation {
	private double cotisationBase;
	private double cotisationTheorique;
	private double cotisationTechnique;
	private double cotisationBaseHT;
	private double cotisationHTGlobale;

	public EnsembleCotisation() {

	}

	public EnsembleCotisation(double cotisationBase, double cotisationTheorique, double cotisationTechnique,
			double cotisationBaseHT, double cotisationHTGlobale) {

	}

	public double getCotisationBase() {
		return cotisationBase;
	}

	public void setCotisationBase(double cotisationBase) {
		this.cotisationBase = cotisationBase;
	}

	public double getCotisationBaseHT() {
		return cotisationBaseHT;
	}

	public void setCotisationBaseHT(double cotisationBaseHT) {
		this.cotisationBaseHT = cotisationBaseHT;
	}

	public double getCotisationTheorique() {
		return cotisationTheorique;
	}

	public void setCotisationTheorique(double cotisationTheorique) {
		this.cotisationTheorique = cotisationTheorique;
	}

	public double getCotisationTechnique() {
		return cotisationTechnique;
	}

	public void setCotisationTechnique(double cotisationTechnique) {
		this.cotisationTechnique = cotisationTechnique;
	}

	public double getCotisationHTGlobale() {
		return cotisationHTGlobale;
	}

	public void setCotisationHTGlobale(double cotisationHTGlobale) {
		this.cotisationHTGlobale = cotisationHTGlobale;
	}

	public String resumeCotisation() {
		return "*** la cotisation de base est ==> " + this.getCotisationBase()+ "\n"  + " la cotisation de base hors taxe est ==> " 
				+ this.getCotisationBaseHT()+ "\n"  + " la cotisation théorique est ==> " + this.getCotisationTheorique()+ "\n" 
				+ " la cotisation technique est ==> " + this.getCotisationTechnique() + "\n" + " la cotisation hors taxe globale est ==> "
				+ getCotisationHTGlobale()+" ***"+ "\n" ;
	}

}
