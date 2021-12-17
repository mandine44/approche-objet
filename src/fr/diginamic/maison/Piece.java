package fr.diginamic.maison;

public abstract class Piece {
	public double superficie;
	public int etage;
	private String nom;

	public Piece(double superficie, int etage) {

		if (superficie < 0 || etage < 0) {
			System.out.println("Pas de superficie ou d etage negatif !");
		} else {
			this.superficie = superficie;
			this.etage = etage;
		}
	}

	@Override
	public String toString() {
		return this.getClass().toString();
	}

}
