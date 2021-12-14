package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<>();

		Collections.addAll(entiers, -1, 5, 7, 3, -2, 4, 8, 5);

		/*
		 * Entiers.add(-1); Entiers.add(5); Entiers.add(7); Entiers.add(3);
		 * Entiers.add(-2); Entiers.add(4); Entiers.add(8); Entiers.add(5);
		 */

		for (Integer n : entiers) {
			System.out.println(n);
		}
		System.out.println();

		System.out.println("Taille du tableau: " + entiers.size());

		System.out.println("max de la liste:" + Collections.max(entiers));

		entiers.remove(Collections.min(entiers));

		for (Integer n : entiers) {
			System.out.println(n);
		}
		System.out.println();

		// recherche des entiers negatifs pour suppression

		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) <= 0) {
				entiers.set(i, -entiers.get(i));

			}

		}
		for (Integer n : entiers) {
			System.out.println(n);
		}
		System.out.println();

	}

}
