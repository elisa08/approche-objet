package testListes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> listInt= new ArrayList<>();
		
		listInt.add(-1);
		listInt.add(5);
		listInt.add(7);
		listInt.add(3);
		listInt.add(-2);
		listInt.add(4);
		listInt.add(8);
		listInt.add(5);
		
		
		
		for (int i = 0; i < listInt.size(); i++) {
			
			System.out.println(listInt.get(i));
			
		}
		
		System.out.println(listInt.size());
		
		int nbPG= 0;
		
		
		for (int i = 0; i < listInt.size(); i++) {
			
			if (listInt.get(i)>nbPG) {
				
				nbPG= listInt.get(i);
				
			}
			
		}
		System.out.println("Nombre le plus grand = "+nbPG);
		
		int nbMin= 0;
		int nIndex= 0;
	
		
		for (int i = 0; i < listInt.size(); i++) {
			
			if (listInt.get(i) < nbMin) {
				
				nbMin = listInt.get(i) ;	
				nIndex= i;
			}
			
		}
		
		System.out.println("Nombre le plus petit = "+nbMin);
		listInt.remove(nIndex);
	
		int nbNeg=0;		
		for (int i = 0; i < listInt.size(); i++) {
			int nb = listInt.get(i);

			if (nb < 0) {

				nb = Math.abs(nb);
				nbNeg= nb;
				
			}

		}
		
		System.out.println("Nombre négatif devenu positif :"+nbNeg);
		System.out.println(listInt);
		
	}

}
