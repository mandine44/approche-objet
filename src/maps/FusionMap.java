package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		
		//Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1,  "Rouge");
		map1.put(2,  "Vert");
		map1.put(3,  "Orange");
		
		//Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4,  "Blanc");
		map2.put(5,  "Bleu");
		map2.put(6,  "Orange");
		
		//Création map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		Iterator<Integer> keysIte1 = map1.keySet().iterator();
		while (keysIte1.hasNext()) {
			Integer cle = keysIte1.next();
			String value = map1.get(cle);
			map3.put(cle, value);		
		
		}
		Iterator<Integer> keysIte2 = map2.keySet().iterator();
		while (keysIte2.hasNext()) {
			Integer cle = keysIte2.next();
			String value = map2.get(cle);
			map3.put(cle, value);		
		
		}
		
		//affichage des cles puis des valeurs de la map3
		
		System.out.println("Liste des clés: ");
		Iterator<Integer> keysIte3 = map3.keySet().iterator();
		while (keysIte3.hasNext()) {
			Integer cle = keysIte3.next();
			System.out.println(cle);
		}
		
		
		System.out.println();
		System.out.println("Liste des valeurs: ");
		Iterator<String> valuesIte3 =map3.values().iterator();
		while (valuesIte3.hasNext()) {
			String s = valuesIte3.next();
			System.out.println(s);
		}
		
		
		System.out.println();
	
	
	}

}
