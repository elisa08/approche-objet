package diginamic.recensement;

import java.util.Comparator;

public class ComparatorRegionPop implements Comparator<Region>{

	@Override
	public int compare(Region region, Region autreRegion) {
		// TODO Auto-generated method stub
		
		if(region.getPopTotale() > autreRegion.getPopTotale()) {
			
			return -1;
			
		}
		if (region.getPopTotale() < autreRegion.getPopTotale()) {
			 
			return 1;
			
		}
		
		return 0;
	}

}
