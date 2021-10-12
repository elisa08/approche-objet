package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	double salaireMensuel;
	
	

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel= salaireMensuel;
	}



	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaireMensuel;

	}
	
	@Override
	public String toString() {
			
			return super.toString() + " ,statut : Salarié";
		}

}
