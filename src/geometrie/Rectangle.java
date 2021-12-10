package geometrie;

public class Rectangle implements ObjetGeometrique {

	int longueur =3;
	int largeur = 5;
	
	public double perimetre() {
		return (2*longueur*largeur);
	}
	
	public double surface() {
		return (longueur*largeur);
		
	}

}
