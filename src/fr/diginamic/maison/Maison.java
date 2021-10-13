package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	 private Piece[] piece;
	 
	 public Maison(Piece[] piece) {
		super();
		this.piece = piece;
	}

	public Piece[] ajouterPiece(Piece pieceAjout) {
		
		if (pieceAjout != null) {

			piece = Arrays.copyOf(piece, piece.length + 1);

			piece[piece.length - 1] = pieceAjout;
			
		}else {
			
			System.err.println("Valeur de l'objet incorrecte !");
			
			
		}
		
		return piece;
	}
	
	public double superficieTotale() {
	

		double surfaceTotale=0;
	
		for (int i = 0; i < piece.length; i++) {
			
			double superficie = piece[i].getSuperficie();
			
			if(superficie<=0) {
				
				System.err.println("Valeur de la superficie incorrecte !");
				
			}else {
				
				surfaceTotale= superficie + surfaceTotale;
				
			}
		}
		return surfaceTotale;
		
		
	}
	
	public double superficieEtage(int nbE) {
		
		double surface = 0;
	
	
		for (int i = 0; i < piece.length; i++) {
			int nbEtage= piece[i].getNumeroEtage();
			

			double superficie = piece[i].getSuperficie();
			if(nbEtage == nbE) {
				
				surface = superficie + surface;
			}
		}

		return surface;

	}
	
	public double superficieTypePiece(String pieceDonnee) {

		double surface = 0;

		for (int i = 0; i < piece.length; i++) {
			int nbEtage = piece[i].getNumeroEtage();

			double superficie = piece[i].getSuperficie();
			if (piece[i].getType() .equals(pieceDonnee)) {

				surface = superficie + surface;
			}
		}

		return surface;

	}
	
	public int nombrePiece(String pieceDonnee) {

		int p = 0;

		for (int i = 0; i < piece.length; i++) {
		
			if (pieceDonnee.equals( piece[i].getType())) {

				p++;
			}
		}

		return p;

	}
	
	

}
