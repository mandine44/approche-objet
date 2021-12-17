package jdr;

import java.util.Random;

public class Loup {

	Random random = new Random();

	private int force = 3 + random.nextInt(8 - 3);
	private int pointsVie = 5 + random.nextInt(10 - 5);

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

}
