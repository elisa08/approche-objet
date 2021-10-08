package fr.diginamic.entites;

/**
 * @author Elisa
 *
 */
public class Compte {
		private String numeroCompte;
		private int solde;
		public Compte(String numeroCompte, int solde) {
			super();
			this.numeroCompte = numeroCompte;
			this.solde = solde;
		}
		public String getNumeroCompte() {
			return numeroCompte;
		}
		public void setNumeroCompte(String numeroCompte) {
			this.numeroCompte = numeroCompte;
		}
		public int getSolde() {
			return solde;
		}
		public void setSolde(int solde) {
			this.solde = solde;
		}
		
	
		public String toString() {
			
			return numeroCompte +" "+ solde;
		}
		
		
		
		
}
