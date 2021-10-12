package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle cercle1= new Cercle(15.5);
		double perimetre= cercle1.perimetre();
		double aire= cercle1.aire();
		
		System.out.println("perimetre : "+perimetre+" "+"aire : "+aire);
		
		Cercle cercle2= new Cercle(15);
		double perimetre2= cercle2.perimetre();
		double aire2= cercle2.aire();
		
		System.out.println("perimetre : "+perimetre2+" "+"aire : "+aire2);
		
		CercleFactory nvCercle= new CercleFactory();
//		CercleFactory nouveauCercle= nvCercle.cercleFactory(15);

		
//		System.out.println(nouveauCercle);


	}

}
