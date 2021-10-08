package fr.diginamic.entites;

/**
 * @author Elisa
 *
 */
public class Compte {
		private long numeroCompte;
		private int solde;
		
		public Compte(long numeroCompte, int solde) {
			super();
			this.numeroCompte = numeroCompte;
			this.solde = solde;
		}

		public long getNumeroCompte() {
			return numeroCompte;
		}

		public void setNumeroCompte(long numeroCompte) {
			this.numeroCompte = numeroCompte;
		}

		public int getSolde() {
			return solde;
		}

		public void setSolde(int solde) {
			this.solde = solde;
		}
		
		
		
		
		
}
