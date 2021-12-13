package fr.diginamic.chaines;

import entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractere: " + premierCaractere);

		int longueur = chaine.length();
		System.out.println("Longueur de chaine: " + longueur);

		System.out.println("Index du premier ; de la chaine: "+chaine.indexOf(';'));
		
		String NomFamille = chaine.substring(chaine.indexOf('D'),chaine.indexOf(';'));
		System.out.println("Nom de famille: "+ NomFamille);
		
		System.out.println(NomFamille.toUpperCase());
		System.out.println(NomFamille.toLowerCase());
		
		String minichaine[]= chaine.split(";");
		
		for (int i=0; i<minichaine.length; i++) {
			System.out.println(minichaine[i]);
		}
			
			String salaireChaine=minichaine[2].replace(" ","");
					
			System.out.println(salaireChaine);
			double salaire = Double.parseDouble(salaireChaine);
			System.out.println(salaire);
			
			Salarie salarie1 = new Salarie(minichaine[0], minichaine[1],salaire);
		
	}
}
