package diginamic.recensement;

import java.util.Comparator;

public class ComparatorNbhP implements Comparator<Ville>{

	@Override
	public int compare(Ville ville, Ville autreVille) {
		// TODO Auto-generated method stub
		if (ville.getPopTotale() > autreVille.getPopTotale()) {

			return 1;

		} else if (ville.getPopTotale() < autreVille.getPopTotale()) {

			return -1;

		}
		return 0;
	}

}
