package entites2;

import entities.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse= new AdressePostale(5, "rue des fleurs", 44210, "Pornic");
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse= adresse;
	}
	
	public void affiche() {
		System.out.println ("Nom:" +nom.toUpperCase() + "\nPrenom: "+ prenom);
	}
	
	public void changeNom (String nouveauNom) {
		this.nom = nouveauNom;
	}
	
	public void changePrenom (String nouveauPrenom) {
		this.prenom = nouveauPrenom;
	}
	
	public void changeAdresse (AdressePostale nouvelleAdresse) {
		this.adresse = nouvelleAdresse;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
}
