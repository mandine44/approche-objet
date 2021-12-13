package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne cm1 =new CalculMoyenne();
		cm1.ajout(3);
		System.out.println(cm1.calcul());
		
		System.out.println();

		CalculMoyenne cm2 =new CalculMoyenne();
		cm2.ajout(12);
		System.out.println(cm2.calcul());
	}

}
