package fr.diginamic.maison;

public class Maison {
	public Piece[] tabPiece = new Piece[1];

	double surfaceTotale = 0;
	double surfaceEtage[] = new double[2];

	public void ajouterPiece(Piece piece) {

		if (piece != null) {
			Piece[] tabPiece2 = new Piece[tabPiece.length];
			for (int i = 0; i < tabPiece2.length - 2; i++) {
				tabPiece2[i] = tabPiece[i];
			}
			tabPiece2[tabPiece2.length - 1] = piece;
			tabPiece = tabPiece2;
		} else
			System.out.println("Pas de piece nulle dans ma maison !!");
	}

	public double superficieTotale() {

		for (int i = 0; i < tabPiece.length; i++) {
			surfaceTotale = surfaceTotale + tabPiece[i].superficie;
		}
		return surfaceTotale;
	}

	public double superficieEtage(int etage) {

		for (int i = 0; i < tabPiece.length; i++) {
			// System.out.println("i =" +i);
			// System.out.println("tabPiece[i] =" + tabPiece[i]);
			// System.out.println("tabPiece[i].etage =" + tabPiece[i].etage);

			if (tabPiece[i].etage == etage) {
				// System.out.println("je rentre dans la boucle");
				surfaceEtage[etage] = surfaceEtage[etage] + tabPiece[i].superficie;
			}
		}
		return surfaceEtage[etage]; 
	}

	/*public double superficieParType(Piece piece) {
		double surface = 0;
		for (int i = 0; i < tabPiece.length; i++) {
			System.out.println("tablength :"+tabPiece.length);
			System.out.println("i =" + i);
			System.out.println ("tabPiece[i].getclass =:"+ tabPiece[i].getClass() );
			System.out.println ("piece.getclass =:"+ piece.getClass() );
			if (tabPiece[i].getClass() == piece.getClass()) {
				System.out.println("je suis dans la boucle");
				System.out.println("surface = "+surface);
				System.out.println("superficie de ma piece: " + tabPiece[i].superficie);
				surface += tabPiece[i].superficie;
				System.out.println("surface = "+surface);
			}
		}
		return surface; */

	}


