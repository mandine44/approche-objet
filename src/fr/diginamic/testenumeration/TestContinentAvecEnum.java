package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		Ville Madrid = new Ville("Madrid", 3334730, Continent.EUROPE);
		Ville Rio = new Ville("Rio de Janeiro", 6748000, Continent.AMERIQUE);
		Ville Nairobi = new Ville("Nairobi", 4734881, Continent.AFRIQUE);
		Ville Sydney = new Ville("Sydney", 5312163, Continent.OCEANIE);

		List<Ville> listVilles = new ArrayList<Ville>();
		listVilles.add(Madrid);
		listVilles.add(Rio);
		listVilles.add(Nairobi);
		listVilles.add(Sydney);

		for (Ville v : listVilles) {
			System.out.println(v.getNom() + " est dans le continent: " + v.toString());
		}

	}

}
