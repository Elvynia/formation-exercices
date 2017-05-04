package fr.lyon.formation.exo11.utensil;

/**
 * Classe représentant une cuillière qui a une longueur et qui est un ustensile.
 *
 * @author hb-asus
 *
 */
public class Spoon extends Utensil {
	public final double length;

	/**
	 * Constructeur.
	 *
	 * @param year
	 *            l'année de création de l'assiette utilisée dans la classe
	 *            Utensil.
	 * @param length
	 *            la longueur de la cuillière.
	 */
	public Spoon(int year, double length) {
		super(year);
		this.length = length;
	}

}
