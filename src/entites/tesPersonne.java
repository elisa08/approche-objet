package entites;

public class tesPersonne {
	
	 public static void main(String[] args){
		 
		 AdressePostale adr1= new AdressePostale();
		 adr1.numeroRue=1;
		 adr1.libelleRue= "impasse des Carignans";
		 adr1.codePostal= 34730;
		 adr1.ville= "Montpellier";
		 
		 Personne per1= new Personne();
		 
		 per1.nom="Jean";
		 
		 per1.prenom="Pierre";
		 
		 per1.adressePersonne=adr1;
		 
		 
	 }
	
}
