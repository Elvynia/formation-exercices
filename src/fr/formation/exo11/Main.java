package fr.formation.exo11;

import java.util.List;

import fr.formation.exo11.utensil.Spoon;
import fr.formation.exo11.utensil.Utensil;

public class Main {


	public static void main(String[] args) {
		if (args.length > 0) {
			// new UtensilParser(args[0]).run();
			final Parser parser = new UtensilParser(args[0]);
			parser.run();
			final List<Utensil> utensils = parser.getResults();
			Main.displaySpoonCount(utensils);
//			Main.displayTotalPlateArea(utensils);
//			Main.displayTotalValue(utensils);
		}
	}

	private static void displaySpoonCount(List<Utensil> utensils) {
		int count = 0;
		for (final Utensil utensil : utensils) {
			if (utensil instanceof Spoon) {
				++count;
			}
		}
		System.out.println("Nombre de cuillères : " + count);
	}
}
