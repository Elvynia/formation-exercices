package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employé à la fois vendeur et représentant de la société.
 *
 * @author hb-asus
 *
 */
public class Representant extends Salesman {

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
	public Representant(String name, String firstName, int age, Date hireDate, int turnover) {
		// Appel au constructeur de la classe parent Salesman.
		super(name, firstName, age, hireDate, turnover);
	}

	/**
	 * {@inheritDoc} Calcul à partir du chiffre d'affaires et ajout d'une prime
	 * mensuelle fixe.
	 */
	@Override
	public int calculateSalary() {
		return this.calculateTurnoverPart() + Constants.EMPLOYE_REPRESENTANT_PRIME;
	}

}
