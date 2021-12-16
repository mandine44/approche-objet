package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();
		mapVilles.put("Nice", new Ville("Nice", 343000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
		mapVilles.put("Lyon", new Ville("Lyon", 484000));
		mapVilles.put("Foix", new Ville("Foix", 9700));
		mapVilles.put("Pau", new Ville("Pau", 77200));
		mapVilles.put("Marseille", new Ville("Marseille", 850700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

		// Recherche de la plus petite ville

		int nbMinHabitants = 1000000000;
		String clePlusPetiteVille = "";
		Iterator<String> keysIte = mapVilles.keySet().iterator();

		while (keysIte.hasNext()) {

			String cle = keysIte.next();
			if (mapVilles.get(cle).getNbHabitants() < nbMinHabitants) {
				nbMinHabitants = mapVilles.get(cle).getNbHabitants();
				clePlusPetiteVille = cle;
			}

		}
		// System.out.println("Plus petite ville: "+
		// mapVilles.get(clePlusPetiteVille).nom);

		mapVilles.remove(clePlusPetiteVille);

		Iterator<String> keysIte1 = mapVilles.keySet().iterator();
		while (keysIte1.hasNext()) {
			String cle = keysIte1.next();
			System.out.println(cle);
		}

	}
}
