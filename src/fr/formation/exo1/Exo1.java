package fr.formation.exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principale permettant d'implémenter une solution à l'exercice 1.
 * 
 * @author hb-asus
 *
 */
public class Exo1 implements Runnable {

	/**
	 * Objet Java permettant de lire différent types de données dans un objet
	 * InputStream (flux d'entrée).
	 */
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Point d'entrée de l'application. Construit une nouvelle instance de la
	 * class Exo1 et appelle sa méthode start().
	 * 
	 * @param args
	 *            les arguments passés en paramètre de l'exécution par le
	 *            système.
	 */
	public static void main(String args[]) {
		(new Exo1()).run();
	}

	/**
	 * Méthode permettant de lire un entier sur le flux standard et d'identifier
	 * si il est positif, négatif, pair ou impair.
	 */
	public void run() {
		boolean quit = false;
		while (!quit) {
			log("Entrez un nombre entier :");
			// L'appel à la méthode nextInt() du Scanner permet de récupérer
			// directement un entier sous forme de type primitif. Dans le cas ou la
			// saisie n'est pas un entier, une exception Java est levée et stoppe le
			// programme.
			int number = 0;
			try {
				number = scanner.nextInt();				
			} catch (InputMismatchException e) {
				if (scanner.next().equals("exit")) {
					quit = true;
				} else {
					System.err.println("La valeur saisie est invalide, veuillez recommencer.");
				}
				continue;
			}
			// Utilisation de l'instruction if (si), permettant d'exécuter le code
			// se trouvant à l'intérieur des accolades seulement si la condition
			// entre les parenthèse est vraie.
			if (number == 0) { // Utilisation de l'opérateur == (équivaut à) permettant de faire une comparaison entre deux valeurs.
				log("Le nombre choisi est 0 et est pair");
				// Utilisation de l'instruction else if (sinon si). La condition ne
				// sera évaluée que si, et seulement si, la condition de
				// l'instruction if qui précède est fausse.
			} else if (number > 0) { // Utilisation de l'opérateur > (supérieur à) permettant de comparer l'ordre de deux valeurs.
				log("Le nombre choisi est positif et ".concat(number % 2 == 0 ? "pair" : "impair"));
				// Utilisation de l'instruction else (sinon). La condition ne sera
				// évaluée que si, et seulement si, les deux conditions des
				// instructions if et else if sont fausses.
			} else {
				// Appel à la fonction concat(), disponible même avec une chaine de
				// caractères déclarée entre guillemets, car elle est implicitement
				// transformé en objet String.
				// Utilisation de l'opérateur % (modulo) et de l'opérateur ternaire
				// (condition ? valeur_cas_vrai : valeur_cas_faux).
				log("Le nombre choisi est négatif et ".concat(number % 2 == 0 ? "pair" : "impair"));
			}
		}
		log("Fermeture du programme.");
	}

	/**
	 * Méthode permettant d'encapsuler l'appel de l'affichage sur la sortie
	 * standard. Elle permet d'éviter d'écrire System.out.println() à plusieurs
	 * endroits et donc de changer facilement le flux de sortie de l'affichage.
	 * 
	 * @param message
	 *            le message à afficher.
	 */
	private void log(String message) {
		System.out.println(message);
	}
}
