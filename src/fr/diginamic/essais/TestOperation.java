package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations operation= new Operations();
		
		double addition= operation.calcul(2.5, 2, '+');
		double soustraction= operation.calcul(2.5, 2, '-');
		double multiplication= operation.calcul(2.5, 2, '*');
		double division= operation.calcul(2.5, 2, '/');
		
		System.out.println("addition : "+addition+" soustraction : "+soustraction+" multiplication : "+multiplication+
		" division : "+division);
		
	}

}
