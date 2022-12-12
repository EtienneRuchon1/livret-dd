package pn.src;

public class Reservation {
private int distance;
private int nbCorrespondances;
private String etat;
private double prixTotal;
private double coutParKm;
private String codePromo;
private String villedepart;
private String villearrivee;
private CodeVoyage motifVoyage = new CodeVoyage();

public Reservation() {
	super();
}
public Reservation( String etat, double prixTotal, double coutParKm, String codePromo, CodeVoyage motifVoyage, String villeDepart, String villeArrivee) {
	super();
	Utilitaire.calculerVoyage(villeDepart, villeArrivee);
	this.distance = Utilitaire.dist;
	this.nbCorrespondances = Utilitaire.nbCorrespondances;
	this.etat = etat;
	this.prixTotal = prixTotal;
	this.coutParKm = coutParKm;
	this.codePromo = codePromo;
	this.motifVoyage = motifVoyage;
	this.villedepart = villeDepart;
	this.villearrivee = villeArrivee;
			
}

public int getNbCorrespondances() {
	return nbCorrespondances;
}
public void setNbCorrespondances(int nb) {
	this.nbCorrespondances = nb;
}


public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}

public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public double getPrixTotal() {
	return prixTotal;
}
public void setPrixTotal(double prixTotal) {
	this.prixTotal = prixTotal;
}
public double getCoutParKm() {
	return coutParKm;
}
public void setCoutParKm(double coutParKm) {
	this.coutParKm = coutParKm;
}
public CodeVoyage getMotifVoyage() {
	return motifVoyage;
}
public void setMotifVoyage(CodeVoyage motifVoyage) {
	this.motifVoyage = motifVoyage;
}
public String getCodePromo() {
	return codePromo;
}
public void setCodePromo(String codePromo) {
	this.codePromo = codePromo;
}
public String getVilleDepart() {
	return villedepart;
}
public void setVilleDepart(String villedepart) {
	this.villedepart = villedepart;
}
public String getVilleArrivee() {
	return villearrivee;
}
public void setVilleArrivee(String villearrivee) {
	this.villearrivee = villearrivee;
}
public String resumeReservation() {
	if (this.getEtat() == "Anomalie") return "Une anomalie a été détectée dans le dossier";
    return  "*** "+ this.getVilleDepart()+ " ==> " + this.getVilleArrivee()+ " : " +
                 Utilitaire.dist+ " Km, pour "+ this.getPrixTotal()+" € :: "+ this.getEtat() +" ***" ;
}


}
