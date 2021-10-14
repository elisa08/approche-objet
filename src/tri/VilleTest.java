package tri;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

public class VilleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
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
	
	
	Collections.sort(villes, new ComparatorNbh());
	System.out.println("Tri croissant par nombre habitants : ");
	for (Ville ville : villes) {
		
		System.out.println(ville);
	}
	System.out.println("----------------");
	System.out.println("Tri par ordre alphabétique : ");
	Collections.sort(villes, new ComparatorNom());
	
	for (Ville ville : villes) {
		
		System.out.println(ville);
	}

	}

}
