package fr.formation.exo11.domain;

public class RoundPlate extends Utensil implements Plate {

	private float radius;

	@Override
	public float calcArea() {
		return (float) (Math.pow(this.radius, 2) * Math.PI);
	}

	@Override
	public void setScore(Object obj) {
		this.setRadius(Float.parseFloat(obj.toString()));
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString().replace("Ustensile", "Assiette ronde");
	}

}
