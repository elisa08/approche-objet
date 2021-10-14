package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Double> set= new HashSet<Double>();
		
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		
		for(Double nb : set) {
			System.out.println(nb);
		}
		System.out.println("----------");
		double nbPG= 0;
		double nbPp= 0;
		
		Iterator<Double> iterator= set.iterator();
		
		for (Double nb : set) {

			if (nb > nbPG) {

				nbPG = nb;

			}

		}
		System.out.println("Nombre le plus grand = "+nbPG);
	
		for (Double nb : set) {
			if (nb < nbPp) {

				nbPp = nb;

			}

		}

		System.out.println("Nombre le plus petit = "+nbPp);
		set.remove(nbPp);
		System.out.println("----------");
		System.out.println(set);
	}

}
