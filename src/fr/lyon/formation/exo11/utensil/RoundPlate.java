package fr.lyon.formation.exo11.utensil;

public class RoundPlate extends Utensil implements Plate {
	public final double ray;

	/**
	 * Constructeur.
	 *
	 * @param year
	 *            l'année de création de l'assiette utilisée dans la classe
	 *            Utensil.
	 * @param ray
	 *            le rayon de l'assiette.
	 */
	public RoundPlate(int year, double ray) {
		// Appel du constructeur de la classe Utensil.
		super(year);
		this.ray = ray;
	}

	/**
	 * {@inheritDoc} Calcul de la surface à l'aide du rayon et de PI.
	 */
	@Override
	public double calculateArea() {
		return Math.pow(this.ray, 2) * Math.PI;
	}

}
