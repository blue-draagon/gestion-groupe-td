package entity;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private int age;
	
	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Etudiant)) {
			return false;
		} else {
			Etudiant e = (Etudiant) obj;
			boolean test1 = e.getNom() != null && e.getNom().equals(this.nom);
			boolean test2 = e.getPrenom() != null && e.getPrenom().equals(this.prenom);
			boolean test3 =  e.getAge() == this.age;
			if (test1 && test2 && test3) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Nom = "+this.nom + " Prenom = "+this.prenom + " Age = "+this.age;
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
}
