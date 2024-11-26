public class GestionnaireNotes {

	/**
	 * Affiche note et moyennes
	 * Appel les fonctions afficherNotes et calculerEtAfficherMoyenne
	 * */
	public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
		// Affichage des notes
		afficherNotes(nomEtudiant, notes);

		// Calcul et affichage de la moyenne
		calculerEtAfficherMoyenne(notes);
	}

	/**
	 * Affichage des notes
	 * Parcour la liste de note pour les afficher en fonction du nom de l'étudiant
	 * */
	public void afficherNotes(String nomEtudiant, int[] notes) {
		System.out.println("Notes de " + nomEtudiant + ":");
		for (int note : notes) {
			System.out.println("- " + note);
		}
	}

	/** 
	 * Calcul et affichage de la moyenne
	 * Initialisation de la somme pour la moyenne puis addition des notes
	 * Calcul de la moyenne en parcourant la liste note et en utilisatiant la somme
	 * */
	public void calculerEtAfficherMoyenne(int[] notes) {
		int somme = 0;
		for (int note : notes) {
			somme += note;
		}
		double moyenne = (double) somme / notes.length;
		System.out.println("Moyenne : " + moyenne);
	}
}
