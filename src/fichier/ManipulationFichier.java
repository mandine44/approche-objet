package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		Path pathOrigine = Paths.get("C:/Users/amand/Documents/tempDIGI/recensement.csv");
		Path pathDestination = Paths.get("C:/Users/amand/Documents/tempDIGI/recensement2.csv");

		List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);

		// Creation d'une liste de sortie
		List<String> sortie = new ArrayList<String>();

		Iterator<String> iterateur1 = lines.iterator();

		//Implementation de la premiere ligne du fichier de sortie en ne gardant que 3 colonnes
		String l= iterateur1.next();
		l = l.trim().replaceAll(" ", "");
		String[] tokens = l.split(";");
		sortie.add(tokens[6] + "\t" + tokens[2] + "\t" + tokens[9]);
		
		// Implémentation de la liste de sortie en ne gardant que les villes ayant plus de 25000 habitants
		while (iterateur1.hasNext()) {
			l=iterateur1.next();
			l = l.trim().replaceAll(" ", "");
			String[] tokens1 = l.split(";");

			// int i=Integer.parseInt(tokens[9]);
			if (Integer.parseInt(tokens1[9]) > 25000) {
				sortie.add(tokens1[6] + "\t" + tokens1[2] + "\t" + tokens1[9]);
			}

		}

		for (String s : sortie) {
			System.out.println(s);
		}

		Files.write(pathDestination, sortie, StandardCharsets.UTF_8);
	}

}
