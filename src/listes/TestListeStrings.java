package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeStrings {

	public static void main(String[] args) {
		List<String> villes = new ArrayList<>();
		Collections.addAll(villes, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		// recherche de la ville dont le nom est le plus long
		Iterator iter = villes.iterator();
		int maxLettres = 0;
		String villeMax = "";

		while (iter.hasNext()) {
			String uneVille = (String) iter.next();
			if (maxLettres < uneVille.length()) {
				maxLettres = uneVille.length();
				villeMax = uneVille;
			}

		}
		System.out.println("Ville dont le nom est le plus long: " + villeMax);

		// Mettre tous les noms en majuscule

		for (int i = 0; i < villes.size(); i++) {

			villes.set(i, villes.get(i).toUpperCase());
		}

		for (String uneVille : villes) {
			System.out.println(uneVille);
		}

		System.out.println();
		// supprimer les villes dont les noms commences par N

		for (int i = 0; i < villes.size(); i++) {

			if (villes.get(i).charAt(0) == 'N') {
				// System.out.println("Ville à supprimer: " + villes.get(i));
				villes.remove(villes.get(i));
			}
		}

		for (String uneVille : villes) {
			System.out.println(uneVille);
		}

	}
}
