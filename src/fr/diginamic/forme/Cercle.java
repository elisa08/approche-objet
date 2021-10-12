package fr.diginamic.forme;

public class Cercle extends Forme {
	
	double rayon;
	
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return Math.pow(rayon, 2)*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return rayon*2*Math.PI;
	}

}
