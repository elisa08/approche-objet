package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	int nbJourtravail;
	double montantJournalier;
	
	

	public Pigiste(String nom, String prenom, int nbJourtravail, double montantJournalier) {
		super(nom, prenom);
		this.nbJourtravail= nbJourtravail;
		this.montantJournalier= montantJournalier;
	}



	@Override
	public double getSalaire() {
		
		return nbJourtravail*montantJournalier;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " ,statut : Pigiste";
	}

}
