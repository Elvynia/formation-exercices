package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employé dans le domaine de la manutention et manipulant des produits à
 * risque.
 *
 * @author hb-asus
 *
 */
public class WarehousemanWithRisk extends Warehouseman {

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
	 * @param workHours
	 *            le nombre d'heures travaillées dans le mois.
	 */
	public WarehousemanWithRisk(String name, String firstName, int age, Date hireDate,
			int workHours) {
		// Appel au constructeur de la classe parent Warehouseman.
		super(name, firstName, age, hireDate, workHours);
	}

	/**
	 * {@inheritDoc} Ajout de la prime de risque.
	 */
	@Override
	public int calculateSalary() {
		return super.calculateSalary() + Constants.EMPLOYE_RISK_PRIME;
	}

}
