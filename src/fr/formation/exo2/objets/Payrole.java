package fr.formation.exo2.objets;

public interface Payrole {

	/**
	 * Méthode permettant de calculer le salaire de l'employé. Cette méthode est
	 * abstraite car elle n'est pas implémentée dans cette classe, mais sera
	 * implémentée par les classes enfant (qui utilisent "extends Employee").
	 *
	 * @return int le montant du salaire mensuel de l'employé.
	 */
	public int calculateSalary();

	/**
	 * @return String permet de récupérer le nom complet de la personne associée
	 *         à la paye.
	 */
	public String getName();
}
