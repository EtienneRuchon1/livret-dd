package pn;

public class Garantie {
	private String nom;
	private String code;
	
	
	public Garantie() {
		
	}
	
	public Garantie(String nom,String code) {
		this.code = code;
		this.nom = nom;
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
