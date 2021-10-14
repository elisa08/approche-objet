package map;

import java.util.Collection;

import java.util.HashMap;
import java.util.Set;

public class CreationMap {
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> mapSalaires= new HashMap<>();
		
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		
		Set<String> cles= mapSalaires.keySet();
			for (String string : cles) {
			
			System.out.println(string+" -----> "+mapSalaires.get(string));
			
		}
		
		System.out.println("Taille de la map : "+mapSalaires.size());
		
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Set<Integer> dep = mapVilles.keySet();
		System.out.println("------------");
		System.out.println("Départements : ");
		for (Integer nb : dep) {

			System.out.println(nb);

		}
		Collection<String> val = mapVilles.values();
		System.out.println("------------");
		System.out.println("Villes : ");
		for (String str : val) {

			System.out.println(str);

		}
		System.out.println("------------");
		System.out.println("Taille de la map : "+mapVilles.size());
		System.out.println("------------");
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3= new HashMap<>();
		
		Set<Integer> cle1= map1.keySet();
		
		for (Integer cle : cle1) {
			
			map3.put(cle, map1.get(cle));
		}
		
		Set<Integer> cle2 = map2.keySet();

		for (Integer cle : cle2) {

			map3.put(cle, map2.get(cle));
		}
		System.out.println("Contenu map3 : ");
		Set<Integer> cle3= map3.keySet();
		for (Integer integer : cle3) {
			
			System.out.println(integer+" "+map3.get(integer));
			
		}
	}
}
