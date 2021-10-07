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
	public String transformNomPrenom(String name,String firstname) {
		
		name.toUpperCase();
		firstName.toUpperCase();
		
		return name + firstname;
		
	}
	
	public void changeNom(String newname) {
		
		name= newname;
		
		
	}
	public String AfficherNom() {
		
		return name;
		
	}

	public String AfficherPrenom() {

		return firstName;

	}
	
	public  AdressePostale afficheAdresse() {
		
		return  adressePersonne;
		
	}
	
	public void changerAdresse(AdressePostale nouvelleAdresse) {
		
		adressePersonne= nouvelleAdresse;
		
	}
	
}
