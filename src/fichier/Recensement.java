package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import listes.Ville;

public class Recensement {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int choix;

		boolean continuer = true;

		Path pathOrigine = Paths.get("C:/Users/amand/Documents/tempDIGI/recensement.csv");
		List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);

		// Creation d'une liste "propre" visible dans un fichier de sortie pour faire la
		// suite du TP

		List<String> propre = new ArrayList<String>();

		Iterator<String> iterateur1 = lines.iterator();
		while (iterateur1.hasNext()) {
			String l = iterateur1.next();
			l = l.trim().replaceAll(" ", "");
			String[] tokens = l.split(";");
			propre.add(tokens[0] + "\t" + tokens[1] + "\t" + tokens[2] + "\t" + tokens[3] + "\t" + tokens[4] + "\t"
					+ tokens[5] + "\t" + tokens[6] + "\t" + tokens[7] + "\t" + tokens[8] + "\t" + tokens[9]);
		}
		// Path pathDestination =
		// Paths.get("C:/Users/amand/Documents/tempDIGI/recensementpropre.csv");
		// Files.write(pathDestination, propre, StandardCharsets.UTF_8);

		// MENU

		while (continuer) {
			System.out.println();
			System.out.println("Souhaitez-vous: ");
			System.out.println("1-Afficher la population d'une ville?");
			System.out.println("2-Afficher la population d'un d�partement?");
			System.out.println("3-Afficher la population d'une r�gion?");
			System.out.println("4-Afficher les 10 r�gions les plus peupl�es?");
			System.out.println("5-Afficher les 10 d�partements les plus peupl�s?");
			System.out.println("6-Afficher les 10 villes les plus peupl�es d'un d�partement?");
			System.out.println("7-Afficher les 10 villes les plus peupl�es d'une r�gion?");
			System.out.println("8-Afficher les 10 villes les plus peupl�es de France?");
			System.out.println("9-Sortir?");

			choix = scanner.nextInt();

			switch (choix) {
			case 1: // population d'une ville donn�e
				System.out.println("De quelle ville souhaitez-vous connaitre la population? ");
				String villePopulation = (scanner.next() + "\t");

				for (String s : propre) {
					if (s.contains(villePopulation)) {
						String[] token = s.split("\t");
						System.out.println("La population de " + villePopulation + " est :" + token[9]);
					}
				}

				break;

			case 2: // population d'un d�partement donn�
				System.out.println("De quel d�partement souhaitez-vous connaitre la population? ");
				String DepartementPopulation = (scanner.next() + "\t");
				int nbPopulationDepartement = 0;

				for (String s : propre) {
					if (s.contains(DepartementPopulation)) {
						String[] token = s.split("\t");
						nbPopulationDepartement += Integer.parseInt(token[9]);

					}
				}
				System.out.println("La population de " + DepartementPopulation + " est :" + nbPopulationDepartement);

				break;

			case 3: // population d'une r�gion donn�e
				System.out.println("De quel d�partement souhaitez-vous connaitre la population? ");
				String RegionPopulation = (scanner.next() + "\t");
				int nbPopulationRegion = 0;

				for (String s : propre) {
					if (s.contains(RegionPopulation)) {
						String[] token = s.split("\t");
						nbPopulationRegion += Integer.parseInt(token[9]);

					}
				}
				System.out.println("La population de " + RegionPopulation + " est :" + nbPopulationRegion);

				break;

			case 4: // afficher les 10 regions les plus peupl�es

				List<Region> listRegions = new ArrayList<Region>();

				Region auvergne = new Region("Auvergne-Rh�ne-Alpes\t", 0);
				listRegions.add(auvergne);

				Region hdF = new Region("Hauts-de-France\t", 0);
				listRegions.add(hdF);

				Region paca = new Region("Provence-Alpes-C�ted'Azur\t", 0);
				listRegions.add(paca);

				Region occitanie = new Region("Occitanie\t", 0);
				listRegions.add(occitanie);

				Region grandEst = new Region("GrandEst\t", 0);
				listRegions.add(grandEst);

				Region normandie = new Region("Normandie\t", 0);
				listRegions.add(normandie);

				Region nA = new Region("Nouvelle-Aquitaine\t", 0);
				listRegions.add(nA);

				Region corse = new Region("Corse\t", 0);
				listRegions.add(corse);

				Region bfc = new Region("Bourgogne-Franche-Comt�\t", 0);
				listRegions.add(bfc);

				Region bretagne = new Region("Bretagne\t", 0);
				listRegions.add(bretagne);

				Region cVdL = new Region("Centre-ValdeLoire\t", 0);
				listRegions.add(cVdL);

				Region iDF = new Region("�le-de-France\t", 0);
				listRegions.add(iDF);

				// Je remplis le champ NbHabitantsRegion pour chaque Region
				for (int i = 0; i < listRegions.size(); i++) {

					Region r = listRegions.get(i);
					for (String s : propre) {
						if (s.contains(r.getNomRegion())) {
							String[] token = s.split("\t");
							r.setNbHabitantsRegion(r.getNbHabitantsRegion() + Integer.parseInt(token[9]));
						}
					}
				}

				// Je trie ma liste

				listRegions.sort(new ComparatorHabRegion());

				// J'affiche les 10 dernieres entr�es de la liste

				System.out.println("Les 10 regions les plus peupl�es sont: ");
				for (int i = listRegions.size() - 1; i >= 2; i--) {

					Region r = listRegions.get(i);

					System.out.println(r.getNomRegion());
					System.out.println(r.getNbHabitantsRegion());

				}

				break;

			case 5: // afficher les 10 d�partements les plus peupl�s

				List<Departement> listDepartements = new ArrayList<Departement>();

				// ajout de tous les departements avec leur numero
				for (int i = 0; i < 95; i++) {
					listDepartements.add(new Departement(i + 1, 0));
					// System.out.println(listDepartements.get(i).getCodeDep());
				}
				listDepartements.add(new Departement(971, 0));
				listDepartements.add(new Departement(972, 0));
				listDepartements.add(new Departement(973, 0));
				listDepartements.add(new Departement(974, 0));

				// Je remplis le champ NbHabitantsRegion pour chaque Departement

				Iterator<String> iterateur3 = propre.iterator();

				while (iterateur3.hasNext()) {

					String s = iterateur3.next();
					String[] token = s.split("\t");

					for (Departement d : listDepartements) {

						if (token[2].equals(String.valueOf(d.getCodeDep()))) {
							d.setNbHabitantsDep(d.getNbHabitantsDep() + Integer.parseInt(token[9]));
						}
					}
				}

				// Je trie ma liste

				listDepartements.sort(new ComparatorHabDep());

				// J'affiche les 10 dernieres entr�es de la liste

				System.out.println("Les 10 d�partements les plus peupl�s sont: ");
				for (int i = listDepartements.size() - 1; i >= 89; i--) {

					Departement r = listDepartements.get(i);
					System.out.println(r.getCodeDep());
					// System.out.println(r.getNbHabitantsDep());
				}

				break;

			case 6: // afficher les 10 villes les plus peupl�es d'un d�partement

				System.out.println("Rentrez le code du departement");
				int codeDep = scanner.nextInt();

				// Je cree une liste avec toutes les villes du departement et leur nombre d
				// habitants
				List<Ville> listVillesparDep = new ArrayList<Ville>();

				for (String s : propre) {
					String[] token = s.split("\t");
					if (token[2].equals(String.valueOf(codeDep))) {
						listVillesparDep.add(new Ville(token[6], Integer.parseInt(token[9])));
					}
				}

				// Je trie ma liste
				listVillesparDep.sort(new ComparatorHabVille());

				// J'affiche les 10 dernieres entr�es de la liste

				System.out.println("Les 10 villes les plus peuplees du departement sont: ");

				for (int i = listVillesparDep.size() - 1; i >= listVillesparDep.size() - 10; i--) {

					Ville v = listVillesparDep.get(i);
					System.out.println(v.getNom());

				}

				break;

			case 7: // afficher les 10 villes les plus peupl�es d'une region
				System.out.println("Rentrez le nom de la region");
				String region = scanner.next();

				// Je cree une liste avec toutes les villes de la region et leur nombre d
				// habitants
				List<Ville> listVillesparReg = new ArrayList<Ville>();

				for (String s : propre) {
					String[] token = s.split("\t");
					if (token[1].equals(region)) {
						listVillesparReg.add(new Ville(token[6], Integer.parseInt(token[9])));
					}
				}

				// Je trie ma liste
				listVillesparReg.sort(new ComparatorHabVille());

				// J'affiche les 10 dernieres entr�es de la liste

				System.out.println("Les 10 villes les plus peuplees de la région sont: ");

				for (int i = listVillesparReg.size() - 1; i >= listVillesparReg.size() - 10; i--) {

					Ville v = listVillesparReg.get(i);
					System.out.println(v.getNom());

				}

				break;

			case 8: // afficher les 10 villes les plus peupl�es de France

				// Je cree une liste avec toutes les villes de France et leur nombre d
				// habitants
				List<Ville> listVillesFrance = new ArrayList<Ville>();

				Iterator<String> iterateur4 = propre.iterator();

				// je saute la premiere ligne de titres
				iterateur4.next();

				while (iterateur4.hasNext()) {
					String s = iterateur4.next();
					String[] token = s.split("\t");
					listVillesFrance.add(new Ville(token[6], Integer.parseInt(token[9])));
				}

				// Je trie ma liste
				listVillesFrance.sort(new ComparatorHabVille());

				// J'affiche les 10 dernieres entr�es de la liste

				System.out.println("Les 10 villes les plus peuplees de la région sont: ");

				for (int i = listVillesFrance.size() - 1; i >= listVillesFrance.size() - 10; i--) {

					Ville v = listVillesFrance.get(i);
					System.out.println(v.getNom());
				}

				break;

			case 9:
				continuer = false;

				break;

			}
		}

	}
}
