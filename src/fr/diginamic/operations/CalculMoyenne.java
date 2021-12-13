package fr.diginamic.operations;

public class CalculMoyenne {
	double tabdouble[] = { 5, 2, 3, 7 };

	public void ajout(double aAjouter) {
		double[] tabdouble1 = new double[tabdouble.length + 1];
		for (int i = 0; i < tabdouble.length; i++) {
			tabdouble1[i] = tabdouble[i];
		}
		tabdouble1[tabdouble1.length - 1] = aAjouter;

		tabdouble = tabdouble1;
		
		//for (int i=0; i<tabdouble.length; i++) {
		//	System.out.println(tabdouble[i]);
		//}
		System.out.println();

	}

	public double calcul() {
		double somme = 0;
		double moyenne=0;
		for (int i = 0; i < tabdouble.length; i++) {
			somme += tabdouble[i];
			//System.out.println("somme =" +somme);
		}
		moyenne = somme / tabdouble.length;
		System.out.println("tabdouble.length = " + (tabdouble.length));	return moyenne;
	}
}
