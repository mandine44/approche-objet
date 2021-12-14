package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maMaison = new Maison();
		Chambre chambre1= new Chambre(20,1);
		Chambre chambre2= new Chambre(25,1);
		Cuisine maCuisine= new Cuisine(12,0);
		Salon monSalon = new Salon(30,0);
		SalleDeBain maSalleDeBain = new SalleDeBain(8,1);
		WC wc1 = new WC(3,0);
		
		
		maMaison.ajouterPiece(chambre1);
		System.out.println("ajout de chambre 1");
		System.out.println("superficie totale:" + maMaison.superficieTotale());
		System.out.println("superficie de l etage 0:" + maMaison.superficieEtage(0));
		System.out.println("superficie de l etage 1:" + maMaison.superficieEtage(1));
		System.out.println();
		
		maMaison.ajouterPiece(chambre2);
		System.out.println("ajout de chambre 2");
		System.out.println("superficie totale:" + maMaison.superficieTotale());
		System.out.println("superficie de l etage 0:" + maMaison.superficieEtage(0));
		System.out.println("superficie de l etage 1:" + maMaison.superficieEtage(1));
		System.out.println();
		
		maMaison.ajouterPiece(maCuisine);
		System.out.println("ajout de ma cuisine");
		System.out.println("superficie totale:" + maMaison.superficieTotale());
		System.out.println("superficie de l etage 0:" + maMaison.superficieEtage(0));
		System.out.println("superficie de l etage 1:" + maMaison.superficieEtage(1));
		System.out.println();
		
		maMaison.ajouterPiece(monSalon);
		System.out.println("ajout de mon salon");
		System.out.println("superficie totale:" + maMaison.superficieTotale());
		System.out.println("superficie de l etage 0:" + maMaison.superficieEtage(0));
		System.out.println("superficie de l etage 1:" + maMaison.superficieEtage(1));
		System.out.println();
		

		maMaison.ajouterPiece(maSalleDeBain);
		System.out.println("ajout de cma salle de bain");
		System.out.println("superficie totale:" + maMaison.superficieTotale());
		System.out.println("superficie de l etage 0:" + maMaison.superficieEtage(0));
		System.out.println("superficie de l etage 1:" + maMaison.superficieEtage(1));
		System.out.println();
		
		maMaison.ajouterPiece(wc1);
		System.out.println("ajout de mes WC1");
		System.out.println("superficie totale:" + maMaison.superficieTotale());
		System.out.println("superficie de l etage 0:" + maMaison.superficieEtage(0));
		System.out.println("superficie de l etage 1:" + maMaison.superficieEtage(1));
		System.out.println();
		
		System.out.println("tablength dans testmamaison :"+maMaison.tabPiece.length);
		
		maMaison.ajouterPiece(null);
		System.out.println("ajout de piece nulle");
	
		//Chambre chambre3= new Chambre(-40,1);
		
		//maMaison.ajouterPiece(chambre3);
		//System.out.println("ajout de chambre negative");

		//System.out.println("superficie totale des chambres :" + maMaison.superficieParType(chambre1));
	}

}
