package fr.diginamic.essais;

import fr.diginamic.forme.Forme;

public class AfficherForme {
	
	
	public void afficher(Forme forme) {
		double perimetre= forme.calculerPerimetre();
		double aire= forme.calculerSurface();
		String texte= "Perimètre de la forme = "+perimetre+ " et aire de la forme = " + aire;
		System.out.println(texte);
//		return texte;
		
	}

}
