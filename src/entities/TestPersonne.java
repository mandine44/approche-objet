package entities;
import entites2.Personne;

public class TestPersonne {
	AdressePostale adresse1 = new AdressePostale(5, "de la paix", 44200, "Coueron");
	AdressePostale adresse2 = new AdressePostale(7, "rue des fetes", 75000, "Paris");
	

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(5, "de la paix", 44200, "Coueron");
		AdressePostale adresse2 = new AdressePostale(7, "rue des fetes", 75000, "Paris");
		Personne personne1 = new Personne("Huret", "Amandine", adresse1);
		Personne personne2 = new Personne("Tralala", "Pedro", adresse2);
		
		
	}

}
