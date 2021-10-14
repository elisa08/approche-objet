package listes;

public class Ville implements Comparable<Ville>{
	
	private int nbH;
	private String nom;
	public Ville(int nbH, String nom) {
		super();
		this.nbH = nbH;
		this.nom = nom;
	}
	public int getNbH() {
		return nbH;
	}
	public void setNbH(int nbH) {
		this.nbH = nbH;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		
		return nom+" "+nbH;
	}
	@Override
	public int compareTo(Ville autreVille) {
//		int resultat= this.getNom().compareTo(autreVille.getNom());
//		return resultat;
		
		if(this.getNbH()>autreVille.getNbH()) {
			
			return 1;
			
		}else if(this.getNbH()<autreVille.getNbH()) {
			
			return -1;
			
		}else {
			
			return 0;
			
		}
	}
	
	
}
