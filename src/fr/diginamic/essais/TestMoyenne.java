package fr.diginamic.essais;



import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double[] tableau= new double[0];
		double tab[]= {10,5};
		CalculMoyenne moy= new CalculMoyenne(tableau);
		CalculMoyenne m= new CalculMoyenne(tab);
		double[] ajout1= moy.ajout(15);
		double[] ajout= m.ajout(15);
		
		double my= moy.calculMoyenne();
		double moyenne= m.calculMoyenne();
		System.out.println(moyenne);
		System.out.println(my);
		
	

	}

}
