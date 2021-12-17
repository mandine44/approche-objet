package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
	List<Piece> listPieces = new ArrayList();
	double surfaceTotale = 0;
	double surfaceEtage[] = new double[2];

	public void ajouterPiece(Piece piece) {
		if (piece != null) {
			listPieces.add(piece);
		} else
			System.out.println("Pas de piece nulle dans ma maison !!");
	}

	public double superficieTotale() {
		for (Piece p : listPieces) {
			surfaceTotale = surfaceTotale + p.superficie;
		}
		return surfaceTotale;
	}

	public double superficieEtage(int etage) {
		for (Piece p : listPieces) {
			if (p.etage == etage) {
				// System.out.println("je rentre dans la boucle");
				surfaceEtage[etage] = surfaceEtage[etage] + p.superficie;
			}
		}
		return surfaceEtage[etage];
	}

	public double superficieParType(Piece piece) {
		double surface = 0;
		for (Piece p : listPieces) {
			if (p.toString().equals(piece.toString())) {
				surface = surface + p.superficie;
			}
		}
		return surface;
	}

	public int nbdePieceparType(Piece piece) {

		int nbPieces = 0;
		for (Piece p : listPieces) {
			if (p.toString().equals(piece.toString())) {
				nbPieces += 1;
			}
		}

		return nbPieces;

	}
}
