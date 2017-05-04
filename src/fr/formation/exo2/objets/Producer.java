package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employé dans le domaine de la production.
 *
 * @author hb-asus
 *
 */
public class Producer extends Employee {
	// Propriété spécifique à un employé dans la production.
	int unitProduced;

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
	 * @param unitProduced
	 *            le nombre d'unités produites par l'employé pour le mois
	 *            courant.
	 */
	public Producer(String name, String firstName, int age, Date hireDate, int unitProduced) {
		// Appel au constructeur de la classe parent Employee.
		super(name, firstName, age, hireDate);
		this.unitProduced = unitProduced;
	}

	/**
	 * {@inheritDoc} Calcul du salaire à partir du nombre d'unités produites et
	 * du coup d'une unité.
	 */
	@Override
	public int calculateSalary() {
		return this.unitProduced * Constants.EMPLOYE_PRODUCER_UNITCOST;
	}

}
