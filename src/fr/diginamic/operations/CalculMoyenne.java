package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	double[] tableau;
	
	
	
	
	public CalculMoyenne(double[] tableau) {
		super();
		this.tableau = tableau;
	}


	public double[] ajout(double a) {
		
		tableau= Arrays.copyOf(tableau, tableau.length+1);
		
		tableau[tableau.length-1]=a;
	
		return tableau;
		
		
	}
	
	public double calculMoyenne() {
		
		double somme=0;
		
		for (int i = 0; i < tableau.length; i++) {
			
			somme= tableau[i] + somme;
			
		}
		
		double moyenne= somme/tableau.length;
		
		return moyenne;
		
	}
	

}
