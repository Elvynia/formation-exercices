package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employé dans le domaine de la manutention.
 *
 * @author hb-asus
 *
 */
public class Warehouseman extends Employee {
	// Propriété spécifique à un employé manutentionnaire.
	int workHours;

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
	public Warehouseman(String name, String firstName, int age, Date hireDate, int workHours) {
		// Appel au constructeur de la classe parent Employee.
		super(name, firstName, age, hireDate);
		this.workHours = workHours;
	}

	/**
	 * {@inheritDoc} Calcul à partir du nombre d'heure et du coût d'une heure de
	 * travail.
	 */
	@Override
	public int calculateSalary() {
		return this.workHours * Constants.EMPLOYE_WAREHOUSE_HOURCOST;
	}

}
