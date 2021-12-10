package fr.diginamic.banque.entities;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compte1= new Compte(254685, 25);
		CompteTaux compte2= new CompteTaux(45825, 70,3);
		Compte []tableau = {compte1, compte2};
		
		for (int i=0; i<tableau.length; i++) {
		System.out.println(tableau[i].toString());

	}

}
}
