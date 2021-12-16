package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listes.Ville;

public class TestCompareVille {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));

		// Collections.sort(villes);

		// Collections.sort(villes, new ComparatorHabitant());

		Collections.sort(villes, new ComparatorNom());

		for (Ville v : villes) {
			System.out.println(v.getNom());
		}
	}

}
