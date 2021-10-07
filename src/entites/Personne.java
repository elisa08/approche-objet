package entites;

public class Personne {
	
	String nom;
	String prenom;
	
	Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;

	}
	
	String name;
	String firstName;
	AdressePostale adressePersonne;


	Personne(String name, String firstName, AdressePostale adressePersonne){
		
		this.name = name;
		this.firstName = firstName;
		this.adressePersonne = adressePersonne;
		
	}
	
	
}
