package fr.diginamic.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, int montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		
		return "DEBIT ";

	}
	

}
