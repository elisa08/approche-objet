package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;


public class TestMaison {

	public static void main(String[] args) {
		
		Piece[] piece= new Piece[0];

		Maison maison= new Maison(piece);
		Chambre chambre= new Chambre(15.5, 0);
		Chambre chambre2= new Chambre(15.5, 0);
		Cuisine cuisine= new Cuisine(10, 0);
		SalleDeBain salleDeBain= new SalleDeBain(9, 0);
		
		Piece[] piecesRdc= maison.ajouterPiece(chambre);
		piecesRdc= maison.ajouterPiece(cuisine);
		piecesRdc= maison.ajouterPiece(cuisine);
		piecesRdc= maison.ajouterPiece(salleDeBain);
		piecesRdc= maison.ajouterPiece(chambre2);
	
		SalleDeBain salleDeBain2= new SalleDeBain(10, 1);
		Piece[] pieceE1= maison.ajouterPiece(salleDeBain2);
		pieceE1= maison.ajouterPiece(null);
		pieceE1= maison.ajouterPiece(salleDeBain2);
		
		SalleDeBain salleDeBain3= new SalleDeBain(-1, 0);
		piecesRdc= maison.ajouterPiece(salleDeBain3);
		
		double superficieP= maison.superficieTypePiece("Chambre");
		double superficieRdc= maison.superficieEtage(1);
		double surfaceT= maison.superficieTotale();
		
		int nbPiece= maison.nombrePiece("Chambre");
		
		for (int i = 0; i < piecesRdc.length; i++) {
			
			System.out.println("Nouvelle piece à l'étage "+piecesRdc[i].getNumeroEtage()+" d'une superficie de "+piecesRdc[i].getSuperficie()+"m2");
			
			
		}
		
		
		System.out.println("Superficie du première étage : "+superficieRdc+"m2");	
		System.out.println("Superficie totale : "+surfaceT+"m2");
		System.out.println("Superficie d'un même type de pièce : "+superficieP);
		System.out.println("Il y a "+nbPiece+" "+chambre.getType()+"s");
		

	}

}
