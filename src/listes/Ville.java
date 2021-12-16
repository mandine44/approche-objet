package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville> {
	private String nom;
	private int nbHabitants;
	private Continent continent;

	public Ville(String nom) {

		this.nom = nom;
	}

	public Ville(String nom, int nbHabitants) {

		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public Ville(String nom, int nbHabitants, Continent continent) {

		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public int compareTo(Ville autre) {
		// return (this.getNom().compareTo(autre.getNom()));

		if (this.getNbHabitants() > autre.getNbHabitants()) {
			return 1;
		}

		if (this.getNbHabitants() < autre.getNbHabitants()) {
			return -1;
		}
		return 0;

	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj;
		return (this.getNom().equals(other.getNom()) && this.getNbHabitants() == other.getNbHabitants());
	}

	@Override
	public String toString() {
		return getContinent().toString();
	}
}
