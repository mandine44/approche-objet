package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison printemps = Saison.PRINTEMPS;
		Saison ete = Saison.ETE;
		Saison automne = Saison.AUTOMNE;
		Saison hiver = Saison.HIVER;

		for (Saison s : Saison.values()) {
			// System.out.println(s.getLibelle());
		}

		String nom = "ETE";

		for (Saison s : Saison.values()) {
			if (s.toString().equals(nom)) {
				System.out.println("libelle correspondant à ETE: " + s.getLibelle());
			}
		}

		String libelle = "Hiver";
		System.out.println("La saison correspondant au libelle Hiver est: " + Saison.getSaison(libelle).toString());
	}

}
