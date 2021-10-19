package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Ville> villes= new ArrayList<>();
		
		Ville ville1= new Ville(0, "New York", Continent.AMERIQUES);
		Ville ville2= new Ville(0, "Paris", Continent.EUROPE);
		Ville ville3= new Ville(0, "Pékin", Continent.ASIE);
		Ville ville4= new Ville(0, "Moscou", Continent.EUROPE);
		Ville ville5= new Ville(0, "Berlin", Continent.EUROPE);
		Ville ville6= new Ville(0, "Sydney", Continent.OCEANIE);
		Ville ville7= new Ville(0, "Sao Paulo", Continent.AMERIQUES);
		Ville ville8= new Ville(0, "Dakar", Continent.AFRIQUE);
		
		villes.addAll(Arrays.asList(ville2,ville3,ville4,ville5,ville6,ville7,ville8));
	
		
		for (Ville ville : villes) {
			
			System.out.println(ville);
			
		}

	}

}
