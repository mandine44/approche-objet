package fichier;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabVille implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getNbHabitants() > o2.getNbHabitants()) {
			return 1;
		}

		if (o1.getNbHabitants() < o2.getNbHabitants()) {
			return -1;
		}
		return 0;
	}

}
