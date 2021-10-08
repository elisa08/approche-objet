package fr.diginamic.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, int montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		
		return "CREDIT ";
		
	}
	

}
