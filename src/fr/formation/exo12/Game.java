package fr.formation.exo12;

public class Game {
	private final Card[] cards;
	private int drawIndex;
	private int playIndex;

	public Game(int cardCount) {
		this.drawIndex = 0;
		this.playIndex = 0;
		this.cards = new Card[cardCount];
		System.out.println("On change de main : ");
	}

	public void display() {
		for (Card card : this.cards) {
			if (card != null) {
				System.out.println(card);
			}
		}
	}

	public void draw(Card card) {
		if (this.drawIndex < this.cards.length) {
			this.cards[this.drawIndex++] = card;
		} else {
			System.out.println("Impossible de piocher, nombre maximal de cartes atteint !");
		}
	}

	public void play() {
		System.out.println("Je joue une carte...");
		System.out.println("La carte jouée est : ".concat(this.cards[this.playIndex].toString()));
		this.cards[this.playIndex++] = null;
	}
}
