package fr.diginamic.essais;
import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
	 Salarie unSalarie = new Salarie();
	 Pigiste unPigiste = new Pigiste();
	 
	//System.out.println ("salaire du salarie: " + unSalarie.getSalaire());
	//System.out.println ("salaire du pigiste: " + unPigiste.getSalaire());

	unSalarie.afficherDonnees();
	unPigiste.afficherDonnees();
	}

}
