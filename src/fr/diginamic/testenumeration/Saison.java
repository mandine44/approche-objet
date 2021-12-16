package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int numeroOrdre;

	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}

	public static Saison getSaison(String libelle) {

		switch (libelle) {
		case "Printemps":
			return Saison.PRINTEMPS;
		case "Ete":
			return Saison.ETE;
		case "Automne":
			return Saison.AUTOMNE;
		default:
			return Saison.HIVER;
		}

	}

}
