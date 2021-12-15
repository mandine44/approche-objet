package fichier;

public class Departement {

	private int code;
	private int nbHabitantsDep;

	public Departement(int code, int nbHabitantsDep) {
		super();
		this.code = code;
		this.nbHabitantsDep = nbHabitantsDep;
	}

	public int getCodeDep() {
		return code;
	}

	public void setNomDep(int codeDep) {
		this.code = codeDep;
	}

	public int getNbHabitantsDep() {
		return nbHabitantsDep;
	}

	public void setNbHabitantsDep(int nbHabitantsDep) {
		this.nbHabitantsDep = nbHabitantsDep;
	}

}
