package entities;

public class AdressePostale {
 
	public int numeroRue;
	public String rue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int numeroRue, String rue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.rue = rue;
		this.codePostal=codePostal;
		this.ville= ville;
	}
}
