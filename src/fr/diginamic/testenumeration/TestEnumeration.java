package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Saison[] saisons= Saison.values();
		
		for (Saison saison : saisons) {
			System.out.println(saison.getNom());
		}
		String nom= "ETE";
		Saison ete= Saison.valueOf(nom);
		
		System.out.println(ete.getNom());
		
		String libelle= "Hiver";
		
		
		Saison saisonRecherchee= Saison.libelleSaison(libelle);
		System.out.println(saisonRecherchee);

	}

}
