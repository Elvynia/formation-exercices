package fr.formation.exo11.domain;

/**
 * Représentation d'une cuillère avec longueur de son manche.
 * 
 * @author Adminl
 *
 */
public class Spoon extends Utensil {

	private float length;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public void setScore(Object obj) {
		this.setLength(Float.parseFloat(obj.toString()));
	}

	@Override
	public String toString() {
		return super.toString().replace("Ustensile", "Cuillère");
	}

}
