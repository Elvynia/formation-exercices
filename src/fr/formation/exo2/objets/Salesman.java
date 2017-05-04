package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employé vendeur.
 *
 * @author hb-asus
 *
 */
public class Salesman extends Employee {
	// Propriété spécifique au vendeur.
	int turnover;

	/**
	 * Constructeur.
	 *
	 * @param name
	 *            le nom de l'employé.
	 * @param firstName
	 *            le prénom de l'employé.
	 * @param age
	 *            l'age de l'employé.
	 * @param hireDate
	 *            la date à laquelle l'employé a été embauché.
	 * @param turnover
	 *            le chiffre d'affaires permettant de calculer le salaire.
	 */
	public Salesman(String name, String firstName, int age, Date hireDate, int turnover) {
		// Appel au constructeur de la classe parent Employee.
		super(name, firstName, age, hireDate);
		this.turnover = turnover;
	}

	/**
	 * {@inheritDoc} Calcul à partir du chiffre d'affaires et ajout d'une prime
	 * mensuelle fixe.
	 */
	@Override
	public int calculateSalary() {
		return this.calculateTurnoverPart() + Constants.EMPLOYE_SALES_PRIME;
	}

	/**
	 * Calcul du montant provenant du pourcentage du chiffre d'affaires.
	 *
	 * @return int le montant calculé.
	 */
	protected int calculateTurnoverPart() {
		return this.turnover * Constants.EMPLOYE_SALES_TURNOVER_PART / 100;
	}

}
