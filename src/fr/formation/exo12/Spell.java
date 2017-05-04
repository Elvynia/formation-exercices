package fr.formation.exo12;

public class Spell extends NamedCard {
	public final String description;

	public Spell(int cost, String name, String description) {
		super(cost, name);
		this.description = description;
		System.out.println("Un sortilège de plus.");
	}

	/**
	 * Affichage de la carte.
	 */
	@Override
	public String toString() {
		return "Un sortilège ".concat(this.name);
	}
}
