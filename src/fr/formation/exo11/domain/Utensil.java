package fr.formation.exo11.domain;

import java.time.LocalDate;

/**
 * Représentation générique d'un ustensile de cuisine.
 * 
 * @author Adminl
 *
 */
public abstract class Utensil {
	private LocalDate creation;

	public abstract void setScore(Object obj);

	/**
	 * Calcul générique de la valeur d'un ustensile si il a plus de 50 ans
	 * (sinon sa valeur est 0).
	 * 
	 * @param current la date à partir de laquelle calculer l'année en cours.
	 * @return int la valeur calculée.
	 */
	public int calcValue(LocalDate current) {
		final int age = current.getYear() - this.creation.getYear();
		return age > 50 ? age - 50 : 0;
	}

	public LocalDate getCreation() {
		return creation;
	}

	public void setCreation(LocalDate creation) {
		this.creation = creation;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Ustensile[");
		sb.append("Fabrication->");
		sb.append(this.creation);
		return sb.toString();
	}

}
