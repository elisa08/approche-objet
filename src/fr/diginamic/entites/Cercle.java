package fr.diginamic.entites;

public class Cercle {
	
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}
	

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		
		double perimetre= 2*rayon*Math.PI;
		return perimetre;
	}
	
	public double aire() {
		
		double aire= Math.pow(rayon, 2)*Math.PI;
		return aire;
		
	}

}
