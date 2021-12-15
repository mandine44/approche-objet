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

		// Creation d'une liste "propre" visible dans un fichier de sortie pour faire la suite du TP
		
		List<String> sortie = new ArrayList<String>();

		Iterator<String> iterateur1 = lines.iterator();
		while (iterateur1.hasNext()) {
			String l = iterateur1.next();
			l = l.trim().replaceAll(" ", "");
			String[] tokens = l.split(";");
			sortie.add(tokens[0] + "\t"+ tokens[1]+ "\t" + tokens[2] + "\t"+ tokens[3] + "\t"+ tokens[4] + "\t"+ tokens[5] + "\t"+ tokens[6] + "\t"+ tokens[7]
					+ "\t"+ tokens[8] + "\t"+ tokens[9]);
		}
		Path pathDestination = Paths.get("C:/Users/amand/Documents/tempDIGI/recensementpropre.csv");
		Files.write(pathDestination, sortie, StandardCharsets.UTF_8);
		
		//MENU

		while (continuer) {
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
			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 9:
				continuer = false;

				break;

			}
		}

	}

}
