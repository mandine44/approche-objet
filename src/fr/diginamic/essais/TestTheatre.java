package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
	Theatre monTheatre = new Theatre();
	
	monTheatre.inscrire(20, 6);
	
	monTheatre.inscrire(12,8);
	System.out.println("total de clients: "+ monTheatre.totalClients);
	System.out.println("recette: "+ monTheatre.recette);
	System.out.println();
	
	monTheatre.inscrire(15, 9);
	System.out.println("total de clients: "+ monTheatre.totalClients);
	System.out.println("recette: "+ monTheatre.recette);
	System.out.println();
	
	monTheatre.inscrire(27, 9);
	System.out.println("total de clients: "+ monTheatre.totalClients);
	System.out.println("recette: "+ monTheatre.recette);
	System.out.println();
	

	}

}
