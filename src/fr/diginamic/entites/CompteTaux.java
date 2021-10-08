package fr.diginamic.entites;

public class CompteTaux extends Compte {
	private int tauxDeRemuneration;
	public CompteTaux(String numeroCompte, int solde,int tauxDeRemuneration) {
		
		super(numeroCompte, solde);
		this.tauxDeRemuneration=tauxDeRemuneration;
		
	}
	public String toString() {
		
		return super.toString() +  " Taux de rémunération: "+ tauxDeRemuneration;
	}
}
