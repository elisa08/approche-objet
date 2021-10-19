package diginamic.recensement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ville {
	
	private int codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private int codeCommune;
	private String nomCommune;
	private int popTotale;
	public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune,
			int popTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;
	}
	
	public String toString() {
		
		return "Nom de commune : "+this.nomCommune + " Nom de r�gion : " + this.nomRegion +" Code de d�partement : "+ this.codeDepartement +" Code de commune : "+ this.codeCommune+" Code de r�gion : "+this.codeRegion+" Population totale : "+this.popTotale;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

	public boolean equals(Object objet) {
		
		if(!(objet instanceof Ville)) {
			
			return false;
			
		}
		
		Ville obj= (Ville) objet;
		
		if(this.nomCommune.equals(obj.getNomCommune()) 
		|| this.nomRegion.equals(obj.getNomRegion()) 
		|| this.codeDepartement.equals(obj.getCodeDepartement())
		|| this.codeRegion == obj.getCodeRegion() 
		|| this.popTotale == obj.getPopTotale()) {
			
			return true;
			
		}
		
		return false;
	}



	
	
	
}
