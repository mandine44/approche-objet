package entities;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		
		personne1.nom = "Huret";
		personne1.prenom = "Amandine";
		personne1.adresse.numeroRue =5;
		personne1.adresse.Rue = "rue Anatole france";
		personne1.adresse.codePostal = 44220;
		personne1.adresse.Ville = "Coueron";
		
		personne2.nom = "Pedro";
		personne2.prenom = "Tralala";
		personne2.adresse.numeroRue =12;
		personne2.adresse.Rue = "rue des fleurs";
		personne2.adresse.codePostal = 45000;
		personne2.adresse.Ville = "Tartenpion";
		
	}

}
