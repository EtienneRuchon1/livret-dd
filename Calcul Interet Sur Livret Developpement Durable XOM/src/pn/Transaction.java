package pn;

public class Transaction {
	String date;
	String dateDeLaTransactionPrecedente;

	double montant;
	double montantPrecedent;

	public Transaction(String date, String dateDeLaTransactionPrecedente, double montant, double montantPrecedent) {
		super();
		this.date = date;
		this.dateDeLaTransactionPrecedente = dateDeLaTransactionPrecedente;
		this.montant = montant;
		this.montantPrecedent = montantPrecedent;
	}

	public String getDateDeLaTransactionPrecedente() {
		return dateDeLaTransactionPrecedente;
	}

	public void setDateDeLaTransactionPrecedente(String dateDeLaTransactionPrecedente) {
		this.dateDeLaTransactionPrecedente = dateDeLaTransactionPrecedente;
	}

	public Transaction() {
		super();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getMontantPrecedent() {
		return montantPrecedent;
	}

	public void setMontantPrecedent(double montantPrecedent) {
		this.montantPrecedent = montantPrecedent;
	}

}
