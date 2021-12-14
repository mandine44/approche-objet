package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13,  "Marseille");
		mapVilles.put(34,  "Montpellier");
		mapVilles.put(44,  "Nantes");
		mapVilles.put(75,  "Paris");
		mapVilles.put(31,  "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		System.out.println("Liste des clés: ");
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
			Integer n = keysIte.next();
			System.out.println(n);
		}
		
		
		System.out.println();
		System.out.println("Liste des valeurs: ");
		Iterator<String> valuesIte =mapVilles.values().iterator();
		while (valuesIte.hasNext()) {
			String s = valuesIte.next();
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("taille de la map: "+ mapVilles.size());
	}

}
