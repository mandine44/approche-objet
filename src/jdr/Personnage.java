package jdr;

import java.util.Random;

public class Personnage {

	Random random = new Random();
	private int force = 12 + random.nextInt(18 - 12);
	private int pointsVie = 20 + random.nextInt(50 - 20);
	int score = 0;

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointsVie() {
		return pointsVie;
	}

	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}