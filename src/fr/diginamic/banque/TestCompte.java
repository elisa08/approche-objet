package fr.diginamic.banque;

import java.util.Iterator;

import fr.diginamic.entites.Compte;
import fr.diginamic.entites.CompteTaux;

public class TestCompte {
	public static void main(String args[]) {
		
	Compte compte1= new Compte("12255",500);
	
	
//	System.out.println(compte1);
	
	
	
	System.out.println(compte1);
	
	CompteTaux compteTaux= new CompteTaux("111255gg", 800,5);
	
	Compte[] compte= {compte1,compteTaux};
	
	
	for (int i = 0; i<compte.length; i++) {
		
		System.out.println(compte[i]);
		
		
	}
	
	}
}
