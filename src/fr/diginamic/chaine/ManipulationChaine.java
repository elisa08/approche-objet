package fr.diginamic.chaine;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	public static void main(String[] args) {
	String chaine= "Durand;Marcel;2 523.5";
	
	char premierChar= chaine.charAt(0);
	
	int length= chaine.length();
	
	int index= chaine.indexOf(';');
	
	System.out.println(index);
	
	String subChaine= chaine.substring(0,index);
	
	System.out.println(subChaine);
	
	String maj= subChaine.toUpperCase();
	String min= subChaine.toLowerCase();
	
	System.out.println(maj+" "+min);
	
	String tabChaineString[]= chaine.split(";");
	
	for (int i = 0; i < tabChaineString.length; i++) {
		
		System.out.println(tabChaineString[i]);
		
	}
	
	String suppr= tabChaineString[2];
	String esc= suppr.replace(" ", "");
	System.out.println(esc);
	
	double salaire= Double.parseDouble(esc);
	String nom= maj;
	String prenom= tabChaineString[1];
	
	Salarie salarie= new Salarie(nom,prenom,salaire);
	
	}

}
