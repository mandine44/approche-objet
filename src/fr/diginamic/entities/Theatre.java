package fr.diginamic.entities;

public class Theatre {
String nom = "theatre du soleil";
int capaciteMax = 120;
public int totalClients = 50;
public double recette = 7500;

public void inscrire (int nbClients, double prixPlace){
	if (totalClients +nbClients <=capaciteMax) {
		totalClients += nbClients;
		recette += nbClients * prixPlace;
	}
	else System.out.println("La séance est complète pour ce soir");
}
}
