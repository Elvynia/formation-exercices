package fr.formation.exo9;

import java.util.Scanner;

/**
 * Classe principale.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Calcul du résultat du polynôme du troisième degré avec les valeurs a, b,
	 * c, x données. Tous les arguments sont passés en double, car sans cela la
	 * valeur de "(a + b) / 2" sera tronquée. En effet, en Java, si l'on divise
	 * des entiers, leur valeur est tronquée pour que le résultat soit entier
	 * aussi. Dans le but d'obtenir un résultat avec un valeur à virgule, il
	 * faut donc que les éléments du calcul soient déjà des variables à virgules
	 * avant de calculer. N'hésitez pas à me redemander si ce n'est pas clair.
	 *
	 * @param a
	 *            la valeur de a.
	 * @param b
	 *            la valeur de b.
	 * @param c
	 *            la valeur de c.
	 * @param x
	 *            la valeur de x.
	 * @return Double le résultat du polynôme pour les valeurs données.
	 */
	private static Double calculate(double a, double b, double c, double x) {
		return (a + b) / 2 * Math.pow(x, 3) + Math.pow(a + b, 2) * Math.pow(x, 2) + a + b + c;
	}

	/**
	 * Point d'entrée.
	 */
	public static void main(String args[]) {
		// Initialisation du scanner avec le flux d'entrée standard.
		final Scanner scanner = new Scanner(System.in);
		// Saisie des valeurs x et y.
		System.out.print("Entrez a (int) : ");
		Integer a = scanner.nextInt();
		System.out.print("Entrez b (int) : ");
		Integer b = scanner.nextInt();
		System.out.print("Entrez c (int) : ");
		Integer c = scanner.nextInt();
		System.out.print("Entrez x (double) : ");
		Double x = scanner.nextDouble();
		// Appel à la méthode de calcul. Il y a une conversion implicite des
		// variables a, b, c de int vers double.
		System.out.print(
				"La valeur du polynôme est : ".concat(Main.calculate(a, b, c, x).toString()));
		// Fermeture du flux ouvert par le scanner.
		scanner.close();
	}
}
