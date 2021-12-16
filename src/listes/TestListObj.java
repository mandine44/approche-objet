package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListObj {

	public static void main(String[] args) {
		List<Ville> listeVille = new ArrayList<>();

		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));

		int nbMaxHabitants = 0;

		Ville LaPlusGrosseVille = new Ville("", 0);
		Ville LaPlusPetiteVille = new Ville("", 0);

		Iterator iter = listeVille.iterator();

		/*
		 * while (iter.hasNext()) { Ville uneVille = (Ville)iter.next(); if
		 * (uneVille.nbHabitants > nbMaxHabitants) { nbMaxHabitants =
		 * uneVille.nbHabitants; LaPlusGrosseVille=uneVille; } }
		 * System.out.println("La plus grosse ville est: " + LaPlusGrosseVille.nom);
		 * 
		 */
		int nbMinHabitants = 1000000;
		while (iter.hasNext()) {
			Ville uneVille = (Ville) iter.next();
			// System.out.println("nombre d habitants: "+uneVille.nbHabitants);
			if (uneVille.getNbHabitants() < nbMinHabitants) {
				// System.out.println("Je suis dans la boucle");
				nbMinHabitants = uneVille.getNbHabitants();
				LaPlusPetiteVille = uneVille;
				// System.out.println("La plus petite ville est: "+ LaPlusPetiteVille.nom);
			}
		}
		listeVille.remove(LaPlusPetiteVille);

		for (Ville v : listeVille) {
			System.out.println(v.getNom());
		}
	}

}
