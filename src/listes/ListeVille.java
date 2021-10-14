package listes;

import java.util.ArrayList;

public class ListeVille {
	public static void main(String[] args) {
		
		ArrayList<Ville> villes= new ArrayList<Ville>();
		
		Ville ville1= new Ville(343000,"Nice");
		Ville ville2= new Ville(47800,"Carcassonne");
		Ville ville3= new Ville(53400,"Narbonne");
		Ville ville4= new Ville(484000,"Lyon");
		Ville ville5= new Ville(9700,"Foix");
		Ville ville6= new Ville(850700,"Marseille");
		
		villes.add(ville1);
		villes.add(ville2);
		villes.add(ville3);
		villes.add(ville4);
		villes.add(ville5);
		villes.add(ville6);
		
		int nbMax= 0;
		String nom= null;
		for (int i = 0; i < villes.size(); i++) {
			Ville v= villes.get(i);
			
			int nbHb= v.getNbH();
			String nomV= v.getNom();
			
			if(nbHb>nbMax) {
				
				nbMax= nbHb;
				nom= nomV;
				
			}
			
		}
		
		System.out.println(nom);
		
		Ville villeMin=  villes.get(0);
		String nomV= null;
		for (int i = 0; i < villes.size(); i++) {
			Ville v= villes.get(i);
			
			int nbHb= v.getNbH();
			
			
			if(nbHb<villeMin.getNbH()) {
				
				villeMin= v;
				nomV= v.getNom();
				
			}
			
		}
		
		System.out.println(nomV);
		
		villes.remove(villeMin);
		
		System.out.println("----------");
		for (Ville ville : villes) {
			
			System.out.println(ville.toString());
			
		}
		
		
	
	
	}
}
