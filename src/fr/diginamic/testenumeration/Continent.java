package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"), ASIE("Asie"), AFRIQUE("Afrique"), AMERIQUE("Amerique"), OCEANIE("Océanie");

	String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
