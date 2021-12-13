package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle monCercle = new Cercle();
		Rectangle monRectangle = new Rectangle();
		Carre monCarre = new Carre();
		
		System.out.println("proprietes de mon cercle :");
		AffichageForme.afficher(monCercle);
		System.out.println();
		
		System.out.println("proprietes de mon rectangle:");
		AffichageForme.afficher(monRectangle);
		System.out.println();
		
		System.out.println("proprietes de mon carre:");
		AffichageForme.afficher(monCarre);
		System.out.println();
		

	}

}
