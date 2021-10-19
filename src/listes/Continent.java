package listes;

public enum Continent {
	
	AFRIQUE("Afrique"),
	AMERIQUES("Amériques"),
	EUROPE("Europe"),
	ASIE("Asie"),
	OCEANIE("Oceanie");
	
	private String nom;
	
	private Continent(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
	
