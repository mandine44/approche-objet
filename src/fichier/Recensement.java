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
		Path pathDestination = Paths.get("C:/Users/amand/Documents/tempDIGI/recensementpropre.csv");
		Files.write(pathDestination, propre, StandardCharsets.UTF_8);

		// MENU

		while (continuer) {
			System.out.println();
			System.out.println("Souhaitez-vous: ");
			System.out.println("1-Afficher la population d'une ville?");
			System.out.println("2-Afficher la population d'un département?");
			System.out.println("3-Afficher la population d'une région?");
			System.out.println("4-Afficher les 10 régions les plus peuplées?");
			System.out.println("5-Afficher les 10 départements les plus peuplés?");
			System.out.println("6-Afficher les 10 villes les plus peuplées d'un département?");
			System.out.println("7-Afficher les 10 villes les plus peuplées d'une région?");
			System.out.println("8-Afficher les 10 villes les plus peuplées de France?");
			System.out.println("9-Sortir?");

			choix = scanner.nextInt();

			switch (choix) {
			case 1: // population d'une ville donnée
				System.out.println("De quelle ville souhaitez-vous connaitre la population? ");
				String villePopulation = (scanner.next() + "\t");

				for (String s : propre) {
					if (s.contains(villePopulation)) {
						String[] token = s.split("\t");
						System.out.println("La population de " + villePopulation + " est :" + token[9]);
					}
				}

				break;

			case 2: // population d'un département donné
				System.out.println("De quel département souhaitez-vous connaitre la population? ");
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

			case 3: // population d'une région donnée
				System.out.println("De quel département souhaitez-vous connaitre la population? ");
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

			case 4: // afficher les 10 regions les plus peuplées

				List<Region> listRegions = new ArrayList<Region>();

				Region auvergne = new Region("Auvergne-Rhône-Alpes\t", 0);
				listRegions.add(auvergne);

				Region hdF = new Region("Hauts-de-France\t", 0);
				listRegions.add(hdF);

				Region paca = new Region("Provence-Alpes-Côted'Azur\t", 0);
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

				Region bfc = new Region("Bourgogne-Franche-Comté\t", 0);
				listRegions.add(bfc);

				Region bretagne = new Region("Bretagne\t", 0);
				listRegions.add(bretagne);

				Region cVdL = new Region("Centre-ValdeLoire\t", 0);
				listRegions.add(cVdL);

				Region iDF = new Region("Île-de-France\t", 0);
				listRegions.add(iDF);

				for (int i = 0; i < listRegions.size(); i++) {

					Region r = listRegions.get(i);
					for (String s : propre) {
						if (s.contains(r.getNomRegion())) {
							String[] token = s.split("\t");
							r.setNbHabitantsRegion(r.getNbHabitantsRegion() + Integer.parseInt(token[9]));
						}
					}
				}

				listRegions.sort(new ComparatorHabRegion());

				System.out.println("Les 10 regions les plus peuplées sont: ");
				for (int i = listRegions.size() - 1; i >= 2; i--) {

					Region r = listRegions.get(i);

					System.out.println(r.getNomRegion());
					System.out.println(r.getNbHabitantsRegion());

				}

				break;

			case 5: // afficher les 10 départements les plus peuplés

				break;

			case 6: // afficher les 10 villes les plus peuplées d'un département

				break;

			case 7: // afficher les 10 villes les plus peuplées d'une region

				break;

			case 8: // afficher les 10 villes les plus peuplées de France

				break;

			case 9:
				continuer = false;

				break;

			}
		}

	}

}
