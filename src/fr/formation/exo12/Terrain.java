package fr.formation.exo12;

public class Terrain extends Card {
	public final char color;

	public Terrain(char color) {
		super(0);
		this.color = color;
		System.out.println("Un nouveau terrain.");
	}

	private String getColorName() {
		String color = null;
		switch (this.color) {
		case 'b':
			color = "bleu";
			break;
		case 'r':
			color = "rouge";
			break;
		case 'g':
			color = "vert";
			break;
		case 'w':
			color = "blanc";
			break;
		case 'B':
			color = "noir";
			break;
		default:
			color = "incolore";
			break;
		}
		return color;
	}

	/**
	 * Affichage de la carte.
	 */
	@Override
	public String toString() {
		return "Un terrain ".concat(this.getColorName());
	}
}
