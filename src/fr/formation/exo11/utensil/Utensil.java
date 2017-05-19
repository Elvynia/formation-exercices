package fr.formation.exo11.utensil;

/**
 * Classe abstraite représentant un ustensile. Il n'est pas possible de faire
 * une instance d'un ustensile car la classe est abstraite. Pour pouvoir faire
 * un nouvel ustensile il faut utiliser une sous classe concrète.
 *
 * @author hb-asus
 *
 */
public abstract class Utensil {

	/**
	 * Propriété représentant l'année de la création de l'ustensile.
	 */
	public int year;

	/**
	 * Constructeur.
	 *
	 * @param year
	 *            l'année de création de l'ustensile.
	 */
	public Utensil(int year) {
		this.year = year;
	}

	/**
	 * Méthode permettant de calculer la valeur de l'ustensile selon l'année
	 * courante.
	 *
	 * @param currentYear
	 *            l'année pour laquelle calculer la valeur de l'ustensile.
	 * @return int la valeur de l'ustensile.
	 */
	public int calculateValue(int currentYear) {
		return currentYear - this.year - 50;
	}
	
	/**
	 * Permet de remplir la cote correspondant au type d'ustensile.
	 * 
	 * @param obj la valeur à mémoriser dans la propriété de l'instance.
	 */
	public abstract void setScore(final Object obj);
}
