package diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String nomRegion;
	private int popTotale;
//	private List<Ville> villes= new ArrayList<Ville>();

	public Region(String nomRegion,int popTotale) {
		super();
		this.nomRegion = nomRegion;
		this.popTotale= popTotale;
	}
	public String toString() {
		
		return nomRegion+" "+popTotale;
	}
	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}
//	public void addVille(Ville ville) {
//		
//		villes.add(ville);
//		
//		this.popTotale= this.popTotale+ville.getPopTotale();
//	}
}
