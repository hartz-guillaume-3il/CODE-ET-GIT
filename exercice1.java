public class FactureManager {

	private double alimentaire = 0.05;
	private double electronique = 0.1;
	private double luxe = 0.15;
	private double reducSup = 0.05;

	// Calcul le total d'une facture
	public double CalculerFacture(String typeProduit, int quantite, double prixUnitaire) {
		double total = quantite * prixUnitaire;
		total = ReductionBase(typeProduit, total);
		total = ReductionSupplementaire(total);

		return total;
	}

	private double ReductionBase(String typeProduit, double total) {
		double reducBase = 0.0;
		// reduction selon la catégorie
		switch (typeProduit) {
		case "Alimentaire":
			reducBase = alimentaire;
			break;
		case "Electronique":
			reducBase = electronique;
			break;
		case "Luxe":
			reducBase = luxe;
			break;
		default:
			System.out.println("Type de produit inconnu, aucune réduction de base appliquée.");
			break;
		}

		return total - (total * reducBase);
	}

	private double ReductionSupplementaire(double total) {
		// Reduction sur le total
		if (total > 1000) {
			total -= total * reducSup;
		}
		return total;
	}
}
