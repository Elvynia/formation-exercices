package fr.formation.exo11;

import fr.formation.exo11.utensil.Plate;
import fr.formation.exo11.utensil.RoundPlate;
import fr.formation.exo11.utensil.Spoon;
import fr.formation.exo11.utensil.SquarePlate;
import fr.formation.exo11.utensil.Utensil;

public class Main {

	private static void displayPlateSurfaces(Utensil[] utensils) {
		double total = 0;
		for (int i = 0; i < utensils.length; i++) {
			if (utensils[i] instanceof Plate) {
				total += ((Plate) utensils[i]).calculateArea();
			}
		}
		System.out.println("Surface totale des assiettes : " + total);
	}

	private static void displaySpoons(Utensil[] utensils) {
		int spoonCount = 0;
		for (int i = 0; i < utensils.length; i++) {
			if (utensils[i] instanceof Spoon) {
				++spoonCount;
			}
		}
		System.out.println("Il y a " + spoonCount + " cuillères.");
	}

	private static void displayTotalValue(Utensil[] utensils) {
		double total = 0;
		int currentYear = 2009;
		for (int i = 0; i < utensils.length; i++) {
			total += utensils[i].calculateValue(currentYear);
		}
		System.out.println("Valeur totale de la collection : " + total);
	}

	public static void main(String[] args) {
		Utensil[] utensils = new Utensil[5];
		utensils[0] = new RoundPlate(1926, 8.4);
		utensils[1] = new Spoon(1881, 7.3);
		utensils[2] = new SquarePlate(1935, 5.6);
		utensils[3] = new Spoon(1917, 8.8);
		utensils[4] = new RoundPlate(1837, 5.4);

		Main.displaySpoons(utensils);
		Main.displayPlateSurfaces(utensils);
		Main.displayTotalValue(utensils);
	}
}
