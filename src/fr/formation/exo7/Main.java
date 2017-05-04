package fr.formation.exo7;

import java.util.Scanner;

/**
 * Classe principale de l'exercice.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Point d'entrée de l'application.
	 */
	public static void main(String[] args) {
		// Initialisation du scanner avec le flux d'entrée standard.
		final Scanner scanner = new Scanner(System.in);
		// Saisie des valeurs x et y.
		System.out.print("Entrez x : ");
		Integer x = scanner.nextInt();
		System.out.print("Entrez y : ");
		Integer y = scanner.nextInt();
		// Affichage avant permutation.
		System.out.println("Avant permutation : ");
		System.out.println("x : ".concat(x.toString()));
		System.out.println("y : ".concat(y.toString()));
		// Permutation des valeurs x et y.
		int permut = x;
		x = y;
		y = permut;
		// Affichage après permutation.
		System.out.println("Après permutation : ");
		System.out.println("x : ".concat(x.toString()));
		System.out.println("y : ".concat(y.toString()));
		// Fermeture du flux ouvert par le scanner.
		scanner.close();
	}

}
