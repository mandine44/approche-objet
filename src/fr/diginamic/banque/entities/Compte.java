package fr.diginamic.banque.entities;

public class Compte {
	private int numeroCompte;
	private int soldeCompte;
	
	public Compte(int numero,int solde ) {
		numeroCompte = numero;
		soldeCompte = solde;
	}
	
	public String toString() {
		return ("numero de compte: "+ numeroCompte + "\n solde: "+ soldeCompte);
	}

}
