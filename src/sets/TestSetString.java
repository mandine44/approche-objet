package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		Collections.addAll(set, "USA","France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
		
		Iterator <String>iter = set.iterator();
		int maxLettres = 0;
		String paysMax = "";

		while (iter.hasNext()) {
			String unPays = (String) iter.next();
			if (maxLettres < unPays.length()) {
				maxLettres = unPays.length();
				paysMax = unPays;
			}

		}
		System.out.println("Pays dont le nom est le plus long: " + paysMax);
		
		set.remove("Allemagne");
		
		for (String p: set) {
			System.out.println(p);
		}
	}

}
