package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {
	private int taux;
	
	public CompteTaux(int numeroCompte, int solde, int tauxRemuneration) {
		super(numeroCompte, solde);
		taux = tauxRemuneration;
	}
	
	public String toString() {
		return (super.toString() + "\ntaux: "+ taux);
		
	}
	
}
