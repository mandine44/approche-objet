package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int nbJoursTravailles=10;
	double salaireJournalier =70;
	
	public double getSalaire() {
		return nbJoursTravailles * salaireJournalier;
	}
	public String getStatut() {
		return ("Pigiste");
	}
}
