package listes;

public class Ville implements Comparable<Ville>{
	
	private int nbH;
	private String nom;
	private Continent continent;
	public Ville(int nbH, String nom, Continent continent) {
		super();
		this.nbH = nbH;
		this.nom = nom;
		this.continent= continent;
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
		
		return nom+" Nombre habitants "+nbH+", continent "+continent.getNom();
	}
	
	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
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
