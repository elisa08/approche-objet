package sets;

import java.util.HashSet;

public class SetTestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set= new HashSet<String>();
		
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		
		String chaineLaplusLongue= "";
		
		for (String chaine : set) {
			
			if(chaine.length()>chaineLaplusLongue.length()) {
				
				chaineLaplusLongue= chaine;
				
			}
			
		}
		System.out.println(chaineLaplusLongue);
		
		set.remove(chaineLaplusLongue);
		
		System.out.println(set);
		
		
	
		

	}

}
