package module;

import java.util.ArrayList;
import java.util.List;

import entity.Etudiant;

public class GroupeTd {
	private int maxSize;
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();

	public GroupeTd(int maxSize, List<Etudiant> etudiants) {
		super();
		this.maxSize = maxSize;
		this.etudiants = etudiants;
	}

	public GroupeTd(int maxSize) {
		super();
		this.maxSize = maxSize;
	}

	public void setMax_size(int maxSize) {
		this.maxSize = maxSize;
	}

	public boolean ajouterEtudiant(Etudiant etudiant) {
		if (etudiants.size() < maxSize) {
			etudiants.add(etudiant);
			return true;
		}
		return false;
	}
	
	public boolean rechercherEtudiant(Etudiant etudiant) {
		return etudiants.contains(etudiant);
	}

	public boolean supprimerEtudiant(Etudiant etudiant) {
		if (etudiants.contains(etudiant)) {
			etudiants.remove(etudiant);
			return true;
		}
		return false;
	}
	
	public void afficheList() {
		System.out.println("--------- Liste des étudiants du groupe ---------------");
		for (Etudiant etudiant : etudiants) {
			etudiant.affiche();
		}
		System.out.println("-------------------------------------");
	}
}
