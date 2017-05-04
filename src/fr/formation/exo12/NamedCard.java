package fr.formation.exo12;

public class NamedCard extends Card {
	public final String name;

	public NamedCard(int cost, String name) {
		super(cost);
		this.name = name;
	}

}
