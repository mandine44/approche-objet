package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetObjet {

	public static void main(String[] args) {

		HashSet<Pays> setPays = new HashSet<>();

		Pays Usa = new Pays("USA", 331449281, 55805);
		setPays.add(Usa);

		Pays France = new Pays("France", 68014000, 42878);
		setPays.add(France);

		Pays Allemagne = new Pays("Allemagne", 83149300, 45466);
		setPays.add(Allemagne);

		Pays UK = new Pays("UK", 67886004, 39228);
		setPays.add(UK);

		Pays Italie = new Pays("Italie", 60359546, 30657);
		setPays.add(Italie);

		Pays Japon = new Pays("Japon", 125507472, 39058);
		setPays.add(Japon);

		Pays Chine = new Pays("Chine", 1411780000, 10582);
		setPays.add(Chine);

		Pays Russie = new Pays("Russie", 146780700, 11099);
		setPays.add(Russie);

		Pays Inde = new Pays("Inde", 1326093247, 1626);
		setPays.add(Inde);

		/*
		 * //Recherche du Pays avec le PIB /habitant le plus elev� Iterator <Pays>iter =
		 * setPays.iterator(); int maxPIB = 0; Pays paysPIBMax = new Pays ("", 0, 0);
		 * 
		 * while (iter.hasNext()) { Pays unPays = (Pays) iter.next(); if (maxPIB <
		 * unPays.PIB) { maxPIB = unPays.PIB; paysPIBMax = unPays; }
		 * 
		 * } System.out.println("Pays dont le PIB par habitant est le plus elev�: " +
		 * paysPIBMax.nom);
		 */

		/*
		 * // Recherche du Pays avec le PIB total le plus elev� Iterator<Pays> iter =
		 * setPays.iterator();
		 * 
		 * double maxPIBtotal = 0; Pays paysPIBMaxTotal = new Pays("", 0, 0);
		 * 
		 * while (iter.hasNext()) { Pays unPays = (Pays) iter.next();
		 * 
		 * if (maxPIBtotal < (unPays.PIB * unPays.nbHabitants)) { maxPIBtotal =
		 * (unPays.PIB * unPays.nbHabitants); paysPIBMaxTotal = unPays; }
		 * 
		 * } System.out.println("Pays dont le PIB total est le plus elev�: " +
		 * paysPIBMaxTotal.nom);
		 */

		// Mise en majuscule du Pays avec le PIB total le plus bas
		Iterator<Pays> iter = setPays.iterator();

		long minPIBtotal = 100000000000000000l;
		Pays paysPIBMinTotal = new Pays("", 0, 0);

		while (iter.hasNext()) {
			Pays unPays = iter.next();

			if (minPIBtotal > (unPays.getPIB() * unPays.getNbHabitants())) {
				minPIBtotal = (unPays.getPIB() * unPays.getNbHabitants());
				paysPIBMinTotal = unPays;
			}

		}
		String nomMaj = paysPIBMinTotal.getNom().toUpperCase();
		paysPIBMinTotal.setNom(nomMaj);

		// affichage des differents Pays et de leurs attributs
		for (Pays p : setPays) {
			System.out.println(p.getNom() + "\t" + p.getNbHabitants() + "\t" + p.getPIB());

		}

		System.out.println();
		// Je supprime le pays dont le PIB est le plus petit
		setPays.remove(paysPIBMinTotal);

		for (Pays p : setPays) {
			System.out.println(p.getNom() + "\t" + p.getNbHabitants() + "\t" + p.getPIB());

		}
	}

}
