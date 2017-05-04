package fr.formation.exo2.objets;

import java.util.Date;

import fr.formation.exo2.Constants;

/**
 * Employé dans le domaine de la production et manipulant des produits à risque.
 *
 * @author hb-asus
 *
 */
public class ProducerWithRisk extends Producer {

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
	public ProducerWithRisk(String name, String firstName, int age, Date hireDate,
			int unitProduced) {
		// Appel au constructeur de la classe parent Producer.
		super(name, firstName, age, hireDate, unitProduced);
	}

	/**
	 * {@inheritDoc} Ajout de la prime de risque.
	 */
	@Override
	public int calculateSalary() {
		return super.calculateSalary() + Constants.EMPLOYE_RISK_PRIME;
	}
}
