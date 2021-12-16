package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville nantes = new Ville("Nantes", 314138);
		Ville nantesbis = new Ville("Nantes", 314138);

		System.out.println("nantes equals nantesbis? " + nantes.equals(nantesbis));

		boolean test = nantes == nantesbis;
		System.out.println("nantes == nantesbis? " + test);

		Ville nantester = new Ville("Nantes", 314139);

		System.out.println("nantes equals nantesbis? " + nantes.equals(nantester));

		test = nantes == nantester;
		System.out.println("nantes == nantester? " + test);
	}

}
