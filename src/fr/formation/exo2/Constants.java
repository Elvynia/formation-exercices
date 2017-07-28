package fr.formation.exo2;

/**
 * Classe regroupant les différentes constantes de l'application. Cela permet
 * d'éviter d'avoir des valeurs en dur partout dans l'application, ainsi que de
 * les changer qu'a un seul endroit.
 *
 * @author hb-asus
 *
 */
public class Constants {
	
	/**
	 * Préfixe du libellé des factures de frais de déplacement pour les indépendants.
	 */
	public static final String TRAVEL_FEES = "Frais de déplacement";

	/**
	 * Salaire par unité pour un employé dans la production.
	 */
	public static final int EMPLOYE_PRODUCER_UNITCOST = 5;

	/**
	 * Prime mensuelle pour un représentant.
	 */
	public static final int EMPLOYE_REPRESENTANT_PRIME = 800;

	/**
	 * Prime bonus pour les employés manipulant des produits à risque.
	 */
	public static final int EMPLOYE_RISK_PRIME = 200;

	/**
	 * Prime mensuelle pour un vendeur.
	 */
	public static final int EMPLOYE_SALES_PRIME = 400;

	/**
	 * Pourcentage du chiffre d'affaire permettant de calculer le salaire d'un
	 * vendeur.
	 */
	public static final int EMPLOYE_SALES_TURNOVER_PART = 20;

	/**
	 * Salaire horaire pour les employés de la manutention.
	 */
	public static final int EMPLOYE_WAREHOUSE_HOURCOST = 65;
}
