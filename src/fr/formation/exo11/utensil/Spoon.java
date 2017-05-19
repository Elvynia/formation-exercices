package fr.formation.exo11.utensil;

/**
 * Classe représentant une cuillière qui a une longueur et qui est un ustensile.
 *
 * @author hb-asus
 *
 */
public class Spoon extends Utensil {
	public double length;
	
	public Spoon() {
		super(0);
		this.length = 0;
	}

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

	@Override
	public void setScore(Object obj) {
		this.length = (double) obj;
	}

}
