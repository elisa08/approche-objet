package fr.diginamic.operations;

public class Operations {
	
	public double calcul(double a, double b,char c) {
		
		double calcul=0;
		
		
		
		if (c == '-') {
			
			calcul= a-b;
			
		}else if (c =='+') {
			
			calcul= a+b;
			
		}else if (c == '*') {
			
			calcul= a*b;
			
		}else if (c == '/') {
			
			calcul= a/b;
			
		}else {
			
			System.out.println("caractère invalide");
			
		}
		
		return calcul;
	}
			
			
			
		
		
	
}
