package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom ="Tartenpion";
	private String prenom = "germaine";

	public abstract double getSalaire();
	public abstract String getStatut();

	public void afficherDonnees() {
		
		System.out.println("Nom :" + nom);
		System.out.println("Prenom :" + prenom);
		System.out.println("Salaire: "+ this.getSalaire());
		System.out.println("Statut: "+ this.getStatut());
		

	}
}
