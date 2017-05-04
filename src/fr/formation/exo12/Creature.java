package fr.formation.exo12;

public class Creature extends NamedCard {
	/**
	 * Attack points.
	 */
	public Integer ap;

	/**
	 * Health points.
	 */
	public Integer hp;

	public Creature(int cost, String name, int ap, int hp) {
		super(cost, name);
		this.ap = ap;
		this.hp = hp;
		System.out.println("Une nouvelle créature.");
	}

	/**
	 * Affichage de la carte.
	 */
	@Override
	public String toString() {
		return "Une créature ".concat(this.name).concat(" ").concat(this.ap.toString()).concat("/")
				.concat(this.hp.toString());
	}
}
