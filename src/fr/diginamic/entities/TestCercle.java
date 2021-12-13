package fr.diginamic.entities;
import fr.diginamic.utils.*;

public class TestCercle {

	public static void main(String[] args) {
		//Cercle cercle1 = new Cercle (5);
		//Cercle cercle2 = new Cercle (8);
		
		Cercle cercle1=CercleFactory.FabriquerCercle(5);
		Cercle cercle2=CercleFactory.FabriquerCercle(8);
		
		System.out.println(cercle1.perimetre());
		System.out.println(cercle1.surface());
		
		System.out.println(cercle2.perimetre());
		System.out.println(cercle2.surface());		
		

	}

}
