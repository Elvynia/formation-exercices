package fr.formation.exo11.domain;

public class SquarePlate extends Utensil implements Plate {

	private float score;

	@Override
	public float calcArea() {
		return (float) Math.pow(score, 2);
	}

	public float getScore() {
		return score;
	}

	@Override
	public void setScore(Object score) {
		this.score = Float.parseFloat(score.toString());
	}

	@Override
	public String toString() {
		return super.toString().replace("Ustensile", "Assiette carré");
	}

}
