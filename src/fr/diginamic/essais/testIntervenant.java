package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class testIntervenant {

	public static void main(String[] args) {
		
		Salarie salarie= new Salarie("Perret", "Jean", 1500.50);
		double salaire= salarie.getSalaire();
//		System.out.println(salaire);
		salarie.afficherDonnees();
		
		Pigiste pigiste= new Pigiste("Paulet", "Pierre", 10, 150.05);
		double salairePigiste= pigiste.getSalaire();
//		System.out.println(salairePigiste);
		pigiste.afficherDonnees();

	}

}
