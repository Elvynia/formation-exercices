package fr.formation.exo11.utensil;

public class RoundPlate extends Utensil implements Plate {
	public double ray;
	
	public RoundPlate() {
		super(0);
		this.ray = 0;
	}

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

	@Override
	public void setScore(Object obj) {
		this.ray = (double) obj;
	}

}
