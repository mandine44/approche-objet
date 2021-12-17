package jdr;

import java.util.Random;
import java.util.Scanner;

public class TestJDR {

	public static void main(String[] args) {

		int choix;
		boolean continuer = true;
		Personnage monPersonnage = new Personnage();
		Loup unLoup = new Loup();
		Gobelin unGobelin = new Gobelin();
		Scanner scanner = new Scanner(System.in);

		while (continuer) {
			// Menu
			System.out.println("Souhaitez-vous: ");
			System.out.println("1 -Créer un personnage");
			System.out.println("2 -Combattre une créature");
			System.out.println("3 - Afficher le score");
			System.out.println("4 - sortir");

			choix = scanner.nextInt();

			switch (choix) {

			case 1: // Creer un personnage
				monPersonnage = new Personnage();
				System.out.println("Vous venez de creer un personnage de force " + monPersonnage.getForce()
						+ " et ayant: " + monPersonnage.getPointsVie() + " points de vie");
				System.out.println();

				break;

			case 2: // combattre une créature
				if (monPersonnage.getPointsVie() == 0) {
					System.out.println("Votre personnage est décédé. Il a obtenu le score de "
							+ monPersonnage.getScore() + ". Veuillez creer un nouveau personnage.");
				} else {
					System.out.println("Souhaitez vous combattre: ");
					System.out.println(" 1 - un loup");
					System.out.println(" 2 - un gobelin");
					// System.out.println(" 3 - un troll");
					System.out.println();

					int choixCreature = scanner.nextInt();

					switch (choixCreature) {
					case 1:

						Random random = new Random();
						int attaqueLoup = unLoup.getForce() + 1 + random.nextInt(10 - 1);
						int attaqueMonPerso = monPersonnage.getForce() + 1 + random.nextInt(10 - 1);
						int degats = Math.abs(attaqueLoup - attaqueMonPerso);

						System.out.println("Attaque du loup: " + attaqueLoup);
						System.out.println("Attaque de mon personnage: " + attaqueMonPerso);

						if (attaqueMonPerso >= attaqueLoup) {
							System.out.println("Vous avez gagné ce combat!");
							System.out.println();
							System.out.println("Vous infligez au loup une quantité de dégats de: " + degats);
							monPersonnage.setPointsVie(monPersonnage.getPointsVie() + degats);
							unLoup.setPointsVie(unLoup.getPointsVie() - degats);
							monPersonnage.setScore(monPersonnage.getScore() + 1);
							System.out.println();
							System.out.println("Votre nouveau score est: " + monPersonnage.getScore());
						} else {
							System.out.println("Vous avez perdu ce combat!");
							System.out.println();
							System.out.println("Le loup vous a infligé une quantité de dégats de: " + degats);
							System.out.println();
							monPersonnage.setPointsVie(monPersonnage.getPointsVie() - degats);
							unLoup.setPointsVie(unLoup.getPointsVie() + degats);
							if (monPersonnage.getPointsVie() <= 0) {
								System.out.println("Vous avez perdu la partie!");
								System.out.println("Votre score est de" + monPersonnage.getScore());
								continuer = false;
							}
						}
						break;

					case 2:
						Random random2 = new Random();
						int attaqueGobelin = unGobelin.getForce() + 1 + random2.nextInt(10 - 1);
						attaqueMonPerso = monPersonnage.getForce() + 1 + random2.nextInt(10 - 1);
						degats = Math.abs(attaqueGobelin - attaqueMonPerso);

						System.out.println("Attaque du gobelin: " + attaqueGobelin);
						System.out.println("Attaque de mon personnage: " + attaqueMonPerso);

						if (attaqueMonPerso >= attaqueGobelin) {
							System.out.println("Vous avez gagné ce combat!");
							System.out.println();
							System.out.println("Vous infligez au gobelin une quantité de dégats de: " + degats);
							monPersonnage.setPointsVie(monPersonnage.getPointsVie() + degats);
							unGobelin.setPointsVie(unGobelin.getPointsVie() - degats);
							monPersonnage.setScore(monPersonnage.getScore() + 1);
							System.out.println();
							System.out.println("Votre nouveau score est: " + monPersonnage.getScore());
						} else {
							System.out.println("Vous avez perdu ce combat!");
							System.out.println();
							System.out.println("Le gobelin vous inflige une quantité de dégats de: " + degats);
							System.out.println();
							monPersonnage.setPointsVie(monPersonnage.getPointsVie() - degats);
							unGobelin.setPointsVie(unGobelin.getPointsVie() + degats);
							if (monPersonnage.getPointsVie() <= 0) {
								System.out.println("Vous avez perdu la partie!");
								System.out.println("Votre score est de" + monPersonnage.getScore());
								continuer = false;
							}
						}
						break;

					case 3:
						break;
					}
				}
				break;

			case 3:// Afficher le score

				System.out.println("Votre score est: " + monPersonnage.getScore());
				System.out.println();

				break;

			case 4: // sortir

				continuer = false;
				break;
			}
		}
	}
}
