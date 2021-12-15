package fichier;

import java.util.Comparator;

public class ComparatorHabRegion implements Comparator<Region> {

	@Override
	public int compare(Region o1, Region o2) {
		if (o1.getNbHabitantsRegion() > o2.getNbHabitantsRegion()) {
			return 1;
		}

		if (o1.getNbHabitantsRegion() < o2.getNbHabitantsRegion()) {
			return -1;
		}
		return 0;
	}

}
