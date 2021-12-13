package fr.diginamic.utils;

import fr.diginamic.entities.Cercle;

public class CercleFactory {
	
	public static Cercle FabriquerCercle(double rayon) {
		Cercle cercle1 = new Cercle(rayon);
		
		return cercle1;
		
	}

}
