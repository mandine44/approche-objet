package geometrie;

public class Cercle implements ObjetGeometrique{
	
	double rayon =5;
	
	public double perimetre() {
		return (2*3.14116*rayon);
	}
	
	public double surface() {
		return (3.14116*rayon*rayon);
		
	}

}
