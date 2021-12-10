package fr.diginamic.banque.entities;

public class TestOperation {

	public static void main(String[] args) {
		
		Credit credit1 = new Credit("20 janvier 2021", 6);
		Credit credit2 = new Credit("22 janvier 2021", 250);
		Credit credit3 = new Credit("25 fevrier 2021", 25);
		Credit credit4 = new Credit("27 mars 2021", 8);
		
		Debit debit1 = new Debit("21 janvier 2021", 15);
		Debit debit2 = new Debit("24 janvier 2021",3);
		Debit debit3 = new Debit("12 fevrier 2021", 18);
		Debit debit4 = new Debit("12 mars 2021", 36);
		
		Operation [] tabOp = {credit1, credit2, debit1, credit3, debit2, debit3, debit4, credit4};
		
		int somme =0;

		
		for (int i=0; i<tabOp.length; i++) {
			System.out.println (tabOp[i].date);
			System.out.println (tabOp[i].montant);
			System.out.println (tabOp[i].getType());
			
			if (tabOp[i].getType()== "CREDIT") {somme +=tabOp[i].montant;}
			else somme -=tabOp[i].montant;
			
			System.out.println ("total: " + somme);
			
		}
	}

}
