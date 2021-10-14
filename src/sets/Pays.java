package sets;

public class Pays {
	private String nom;
	private long nbHb;
	private long pibHb;
	
	public Pays(String nom, long nbHb, long pibHb) {
		super();
		this.nom = nom;
		this.nbHb = nbHb;
		this.pibHb = pibHb;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHb() {
		return nbHb;
	}

	public void setNbHb(long nbHb) {
		this.nbHb = nbHb;
	}

	public long getPibHb() {
		return pibHb;
	}

	public void setPibHb(long pibHb) {
		this.pibHb = pibHb;
	}
	
	public String toString() {
		return "Pays "+nom+" Pib par habitant "+pibHb+" Nombre d'habitants "+nbHb;
	}
}
