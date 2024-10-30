package entity;

public class EtudiantEtranger extends Etudiant {
	private String pays;
	

	public EtudiantEtranger(String nom, String prenom, int age,String pays) {
		super(nom, prenom, age);
		this.pays = pays;
	}

	public EtudiantEtranger() {
		super();
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return super.toString()+" Pays = "+this.pays;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}

}
