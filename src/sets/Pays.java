package sets;

import annotations.ToString;

public class Pays {

	@ToString(uppercase = true, separator = "=>")
	private String nom;

	private long nbHabitants;
	private int PIB;

	public Pays(String nom, long nbHabitants, int pIB) {

		this.nom = nom;
		this.nbHabitants = nbHabitants;
		PIB = pIB;
	}

	@Override

	public String toString() {
		return (nom.toString() + PIB);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public int getPIB() {
		return PIB;
	}

	public void setPIB(int pIB) {
		PIB = pIB;
	}

}
