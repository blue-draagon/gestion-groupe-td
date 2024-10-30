package main;

import entity.Etudiant;
import entity.EtudiantEtranger;
import entity.EtudiantSportif;
import module.GroupeTd;

public class GestionGroupeTd {
	public static void main(String[] args) {
		GroupeTd gt = new GroupeTd(4);
		
		Etudiant sene = new Etudiant("Sene", "Pierre", 12);
		EtudiantSportif fall = new EtudiantSportif("Fall", "Fatou", 5, "Natation");
		EtudiantEtranger ndiaye = new EtudiantEtranger("Ndiaye", "Moussa", 20, "Senegal");

		EtudiantSportif sarr = new EtudiantSportif("Sarr", "Mamadou", 15, "Foot-Ball");
		
		gt.ajouterEtudiant(sene);
		gt.ajouterEtudiant(fall);
		gt.ajouterEtudiant(ndiaye);
		
		gt.afficheList();
		
		if (gt.rechercherEtudiant(sene)) {
			System.out.println(sene + " est présent dans le groupe");
		} else {
			System.out.println(sene + " n'est pas présent dans le goupe");
		}
		
		if (gt.rechercherEtudiant(sarr)) {
			System.out.println(sarr + " est présent dans le goupe");
		} else {
			System.out.println(sarr + " n'est pas présent dans le groupe");
		}
		
		gt.supprimerEtudiant(fall);
		
		gt.afficheList();
	}

}
