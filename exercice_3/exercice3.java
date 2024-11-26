public class StockManager {

	/**
	 * Fonction gererStock qui permet de gérer les stocks à l'aide d'un switch case
	 * 
	 * @param typeOperation Type de l'opération à effectuer ("ajout" ou "retrait").
	 * @param produit       Nom du produit concerné.
	 * @param quantite      Quantité à ajouter ou retirer du stock.
	 * @param stock         Stock actuel du produit.
	 */
	public void gererStock(String typeOperation, String produit, int quantite, int stock) {
		switch (typeOperation.toLowerCase()) {
		case "ajout":
			stock += quantite;
			afficherStock(produit, stock, "après ajout");
			break;

		case "retrait":
			if (stock >= quantite) {
				stock -= quantite;
				afficherStock(produit, stock, "après retrait");
			} else {
				System.out.println("Stock insuffisant pour le produit : " + produit);
			}
			break;

		default:
			System.out.println("Opération inconnue.");
		}
	}

	/**
	 * Fonction d'affichage des stocks Fait appel à tous les éléments après leur
	 * passage dans gererStock
	 * 
	 * @param produit   Nom du produit concerné.
	 * @param stock     Stock actuel après l'opération.
	 * @param operation Description de l'opération effectuée.
	 **/
	private void afficherStock(String produit, int stock, String operation) {
		System.out.println("Produit : " + produit + ", Stock " + operation + " : " + stock);
	}
}
