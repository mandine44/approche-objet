package fichier;

import java.util.Comparator;

public class ComparatorHabDep implements Comparator<Departement> {

	@Override
	public int compare(Departement o1, Departement o2) {
		if (o1.getNbHabitantsDep() > o2.getNbHabitantsDep()) {
			return 1;
		}

		if (o1.getNbHabitantsDep() < o2.getNbHabitantsDep()) {
			return -1;
		}
		return 0;
	}
}
