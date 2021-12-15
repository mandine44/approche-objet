package fichier;

public class Region {

	private String nomRegion;
	private int nbHabitantsRegion;

	public Region(String nomRegion, int nbHabitantsRegion) {
		super();
		this.nomRegion = nomRegion;
		this.nbHabitantsRegion = nbHabitantsRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getNbHabitantsRegion() {
		return nbHabitantsRegion;
	}

	public void setNbHabitantsRegion(int nbHabitantsRegion) {
		this.nbHabitantsRegion = nbHabitantsRegion;
	}

}
