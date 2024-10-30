package entity;

public class EtudiantSportif extends Etudiant {
	private String sport;
	

	public EtudiantSportif(String nom, String prenom, int age,String sport) {
		super(nom, prenom, age);
		this.sport = sport;
	}

	public EtudiantSportif() {
		super();
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return super.toString()+" Sport = "+this.sport;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}

}
