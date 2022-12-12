package pn.src;

public class Passager {
private String nom;
private String prenom;
private int age;
private String carteReduction;


public Passager() {
	super();
}
public Passager(String nom, String prenom, int age, String carte) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.carteReduction = carte;

}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCarteReduction() {
	return carteReduction;
}
public void setCarteReduction(String carte) {
	this.carteReduction = carte;
}

	
}
