package listes;

public class Ville implements Comparable<Ville>{
 public String nom;
 public int nbHabitants;
 
 
public Ville(String nom, int nbHabitants) {

	this.nom = nom;
	this.nbHabitants = nbHabitants;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public int getNbHabitants() {
	return nbHabitants;
}


public void setNbHabitants(int nbHabitants) {
	this.nbHabitants = nbHabitants;
}


@Override
public int compareTo(Ville autre) {
	//return (this.getNom().compareTo(autre.getNom()));
	
	if (this.getNbHabitants()>autre.getNbHabitants()) {
		return 1;
	}
	
	if (this.getNbHabitants()<autre.getNbHabitants()) {
		return -1;
	}
	return 0;
	
}



 
}
