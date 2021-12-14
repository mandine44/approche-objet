package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FusionListe {

	public static void main(String[] args) {
	List<String> liste1 = new ArrayList<String>();
	liste1.add("Rouge");
	liste1.add("Vert");
	liste1.add("Orange");
	
	List<String> liste2 = new ArrayList<String>();
	liste2.add("Blanc");
	liste2.add("Bleu");
	liste2.add("Orange");
	
	List<String> liste3 = new ArrayList<String>();
	
	Iterator<String> iterator = liste1.iterator();
	
	while (iterator.hasNext()) {
		liste3.add(iterator.next());
	}
	
	iterator = liste2.iterator();
	while (iterator.hasNext()) {
		liste3.add(iterator.next());
	}
	
	for (String a : liste3) {
		System.out.println(a);
	}
	}

}
