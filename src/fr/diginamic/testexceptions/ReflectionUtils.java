package fr.diginamic.testexceptions;

import java.lang.reflect.Field;

public class ReflectionUtils {

	public static void afficherAttributs(Object obj)
			throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		// On commence à récupérer la classe de l'objet passée en parametre.
		// la classe fournit toutes les info sur la structure d'un objet.

		if (obj == null) {
			throw new ReflectionException("Veuillez renseigner un objet non nul");
		}
		Class<?> classe = obj.getClass();

		// Sur cette classe on récupere le tableau des variables d'instance
		Field[] fields = classe.getDeclaredFields();

		// On fait une boucle sur ce tableau
		for (Field field : fields) {

			// On force l acces à l'attribut depuis une classe externe.
			// un peu comme si je forçais l'attribut en lisiblité public
			field.setAccessible(true);

			// Affichage
			System.out.println("La valeur de l'attribut " + field.getName() + " est " + field.get(obj).toString());
		}
	}

}
