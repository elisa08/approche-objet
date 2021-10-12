package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
 public static void main(String[] args) {
	 
	 Theatre theatre= new Theatre("Théatre des 13 vents", 50, 0, 0);
	
	 
	 
	 System.err.println(theatre.inscrire(10, 10));
	 System.err.println(theatre.inscrire(10, 10));
	 System.err.println(theatre.inscrire(10, 10));
	 System.err.println(theatre.inscrire(10, 10));
	 System.err.println(theatre.inscrire(10, 10));
	 System.err.println(theatre.inscrire(10, 10));
	
	 
	 int nombreClient= theatre.getNbTotaleClient();
	 double recetteSpectacle= theatre.getRecetteTotale();
	 
	 System.out.println("Nombre total de client : "+nombreClient);
	 
	 System.out.println("Recette total spectacle : "+recetteSpectacle);

	 
 }
}
