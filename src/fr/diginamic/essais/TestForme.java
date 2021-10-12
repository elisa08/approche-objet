package fr.diginamic.essais;

import fr.diginamic.forme.Carre;
import fr.diginamic.forme.Cercle;
import fr.diginamic.forme.Rectangle;
import fr.diginamic.operations.Operations;

public class TestForme {
	
	public static void main(String[] args) {
		
		Rectangle rectangle= new Rectangle(3,2);
		AfficherForme affichage= new AfficherForme();
		affichage.afficher(rectangle);
		
	
		
		Cercle cercle= new Cercle(6);
		AfficherForme affichage2= new AfficherForme();
		affichage2.afficher(cercle);
		
		
		Carre carre= new Carre(5,5);
		AfficherForme affichage3= new AfficherForme();
		affichage3.afficher(carre);
		
	}

}
