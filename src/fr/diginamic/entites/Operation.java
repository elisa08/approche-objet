package fr.diginamic.entites;

public abstract class Operation {
	private String dateOperation;
	private int montant;
	public Operation(String dateOperation, int montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	
	public String toString() {
		
		return "Date "+ dateOperation + " montant "+ montant +" "+ getType();
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	public  abstract String getType();
	
	
	
}
