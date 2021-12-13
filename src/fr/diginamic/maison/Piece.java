package fr.diginamic.maison;

public abstract class Piece {
public double superficie;
public int etage ;


public Piece(double superficie, int etage) {
	
	if (superficie<0 || etage<0)
	{System.out.println ("Pas de superfici ou d etage negatif !");}
	else {
		this.superficie = superficie;
	this.etage = etage;}
}

}
