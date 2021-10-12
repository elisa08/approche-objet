package fr.diginamic.salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public abstract double getSalaire();
	
	public void afficherDonnees() {
		
		System.out.println(toString()); 
		
	}
	
	public String toString() {
		
		return "Intervenant : " + nom + " " + prenom + " perçoit un salaire de "+ getSalaire();
	}
	
	
}
