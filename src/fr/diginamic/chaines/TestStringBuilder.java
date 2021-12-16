package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		// Generation d'une StringBuilder de 100000 entiers et chronometrage
		long debutsb = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100000; i++)
			sb.append(i);
		long finsb = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes pour StringBuilder: " + (finsb - debutsb));

		// Generation d'une String de 100000 entiers et chronometrage
		long debuts = System.currentTimeMillis();
		String s = new String();
		for (int i = 1; i <= 100000; i++) {
			s += i;
		}
		long fins = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes pour String: " + (fins - debuts));
	}
}
