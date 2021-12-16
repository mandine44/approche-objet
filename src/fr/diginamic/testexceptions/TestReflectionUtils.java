package fr.diginamic.testexceptions;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Ville uneVille = new Ville("Madrid", 3334730, Continent.EUROPE);
		ReflectionUtils.afficherAttributs(uneVille);
		ReflectionUtils.afficherAttributs(null);
	}

}
