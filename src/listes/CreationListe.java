package listes;

import java.util.ArrayList;

public class CreationListe {
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		int nb=0;
	
		while(nb<100) {
			
			nb++;
			list.add(nb);
		}
		
		
		
		System.out.println(list.size());
	
	}
}
