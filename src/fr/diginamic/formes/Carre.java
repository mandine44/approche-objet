package fr.diginamic.formes;

public class Carre extends Rectangle {

	double longueur=10;

	public double calculerSurface() {
		return longueur * longueur;
	}

	public double calculerPerimetre() {
		return 4 * longueur;
	}
}
