package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> liste= new ArrayList<String>();
		
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		
		int longueur= 0;
		String chaineLaplusLongue= null;
		
		
		for (int i = 0; i < liste.size(); i++) {
			
			String chaine= liste.get(i);
			
			int c= chaine.length();
			
			if(c>longueur) {
				
				longueur= c;
				
				chaineLaplusLongue= chaine;
				
			}
			
		}
		
		System.out.println(chaineLaplusLongue);
		
		
		
	
		for (int i = 0; i < liste.size(); i++) {
			
			String maj= liste.get(i).toUpperCase();
			
			System.out.println(maj);
			
		}
		
		
	
		for (int i = 0; i <  liste.size(); i++) {
			
			String ch= liste.get(i);
			char c= ch.charAt(0);
			
			if (c == 'N') {
				
				liste.remove(i);
				
			}
			
		}
		
		System.out.println(liste);
	}

}
