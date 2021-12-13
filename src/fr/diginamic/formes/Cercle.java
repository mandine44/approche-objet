package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon =5;
	
	public double calculerSurface() {
		return 3.14116*rayon*rayon;
	}
	
	public double calculerPerimetre() {
		return 2*3.14116*rayon;
	}
}
