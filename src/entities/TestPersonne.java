package entities;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(5, "de la paix", 44200, "Coueron");
		AdressePostale adresse2 = new AdressePostale(7, "rue des fetes", 75000, "Paris");
		//Personne personne1 = new Personne("Huret", "Amandine", adresse1);
		//Personne personne2 = new Personne("Tralala", "Pedro", adresse2);
		
		Personne personne1 = new Personne("Huret", "Amandine");
		Personne personne2 = new Personne("Tralala", "Pedro");
		
		System.out.println(personne1.getAdresse());
		
		personne1.changeAdresse(adresse2);
		
		System.out.println(personne1.getAdresse());
		
		//personne1.affiche();
		//personne1.changeNom("Dumazeau");
		//personne1.affiche();
		//personne1.changePrenom("Emmanuel");
		//personne1.affiche();
		
		//System.out.println(personne2.getNom());
		//System.out.println(personne2.getPrenom());
		//System.out.println(personne2.getAdresse());
	
	}

}
