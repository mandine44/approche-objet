package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		List Entiers = new ArrayList();
		
		for (int i=0; i<100; i++) {
			Entiers.add(i+1);
			System.out.println(Entiers.get(i));
		}
		System.out.println("taille de la liste:" + Entiers.size());

	}

}
