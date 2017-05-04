package fr.formation.exo12;

public class Main {

	public static void main(String[] args) {
		Game maMain = new Game(10);

		maMain.draw(new Terrain('b'));
		maMain.draw(new Creature(6, "Golem", 4, 6));
		maMain.draw(new Spell(1, "Croissance Gigantesque",
				"La créature ciblée gagne +3/+3 jusqu'à la fin du tour"));

		System.out.println("Là, j'ai en stock :");
		maMain.display();
		maMain.play();
	}

}
