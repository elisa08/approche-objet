package diginamic.recensement;

import java.util.Comparator;

public class ComparatorNbhMin implements Comparator<Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
	
		if (o1.getPopTotale() > o2.getPopTotale()) {

			return -1;

		} else if (o1.getPopTotale() < o2.getPopTotale()) {

			return 1;

		}
		return 0;
	}

}
