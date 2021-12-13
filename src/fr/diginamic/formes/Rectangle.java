package fr.diginamic.formes;

public class Rectangle extends Forme {
	double longueur =12;
	double largeur=6;

	public double calculerSurface() {
		return longueur * largeur;
	}

	public double calculerPerimetre() {
		return 2 * (longueur + largeur);
	}
}
