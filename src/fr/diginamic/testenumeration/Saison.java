package fr.diginamic.testenumeration;

public enum Saison {
	
	AUTOMNE("Automne",1),
	HIVER("Hiver",2),
	PRINTEMPS("Printemps",3),
	ETE("Ete",4);
	
	
	private String nom;
	private int numero;
	
	private Saison(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public int getNumero() {
		return numero;
	}
	
	public static Saison libelleSaison(String libelle) {
		Saison[] saisons= Saison.values();
		
		
		for (Saison saison : saisons) {
			
			if(saison.getNom().equals(libelle)) {
				
				return saison;
			}
			
		}
		
		return null;
	}

	
	
}
