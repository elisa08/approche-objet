package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capaciteMax;
	private int nbTotaleClient;
	private double recetteTotale;
	
	
	
	public Theatre(String nom, int capaciteMax, int nbTotaleClient, double recetteTotale) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.nbTotaleClient = nbTotaleClient;
		this.recetteTotale = recetteTotale;
	}
	
	public String inscrire(int nbClient, double prix) {
		
		String message= "";
		
		if(nbTotaleClient <= capaciteMax) {
			
			nbTotaleClient= nbTotaleClient + nbClient;	
			
		}
		
		if(nbTotaleClient > capaciteMax) {
			
			nbTotaleClient= nbTotaleClient - nbClient;
			message= "Capacité d'accueil atteinte.";
			
		}
		
		recetteTotale= prix * nbTotaleClient;
		return message;
		
	}
	public String toString() {
		return nom + " " + "Nombre de client "+ nbTotaleClient + " et recette totale : " + recetteTotale;
	}

	public int getNbTotaleClient() {
		return nbTotaleClient;
	}

	public void setNbTotaleClient(int nbTotaleClient) {
		this.nbTotaleClient = nbTotaleClient;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
	
	

}
