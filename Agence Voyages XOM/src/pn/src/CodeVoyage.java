package pn.src;

public class CodeVoyage {
private String motif;
private int points;
private String codePromo;

public static final CodeVoyage motifLoisir  = new CodeVoyage("Loisir");
public static final CodeVoyage motifTravail  = new CodeVoyage("Travail");
public static final CodeVoyage motifAutre = new CodeVoyage("Autre");
;

public CodeVoyage() {
	super();
}
public CodeVoyage(String s) {
	super();
	this.motif = s;
}

public CodeVoyage(String motif, int points, String codePromo) {
	super();
	this.points = points;
	this.codePromo = codePromo;
	this.motif = motif;
}


public int getPoints() {
	return points;
}

public void setPoints(int points) {
	this.points = points;
}

public String getCodePromo() {
	return codePromo;
}

public void setCodePromo(String codePromo) {
	this.codePromo = codePromo;
}

public String getMotif() {
	return motif;
}


	
}
