package jdr;

import java.util.Random;

public class Gobelin {
	Random random = new Random();

	private int force = 5 + random.nextInt(10 - 5);
	private int pointsVie = 10 + random.nextInt(15 - 10);

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
