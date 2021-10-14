package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNbh implements Comparator<Ville>{

	@Override
	
	public int compare(Ville ville, Ville autreVille) {
		// TODO Auto-generated method stub
		return ville.compareTo(autreVille);
	}
	
	

}
