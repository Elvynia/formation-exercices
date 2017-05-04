package fr.formation.exo6;

import java.util.Scanner;

/**
 * Classe principale de l'exercice 6.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Objet Scanner permettant de récupérer des données saisies sur le flux
	 * d'entrée standard (dans notre cas l'entrée standard est la console).
	 */
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Méthode permettant de vérifier les données saisies pour la largeur et la
	 * hauteur. Les valeurs doivent être positives et différentes de 0.
	 *
	 * @param width
	 *            la largeur saisie.
	 * @param height
	 *            la hauteur saisie.
	 * @return boolean vrai si les données sont valide, faux sinon.
	 * @throws WrongInputException
	 *             si la largeur ou la hauteur saisie n'est pas correcte.
	 */
	private static boolean checkInputs(double width, double height) throws WrongInputException {
		// Déclaration et initialisation d'une variable de retour.
		boolean inputsValid = false;
		// On vérifie si la largeur et la hauteur sont tous les deux strictement
		// supérieur à 0.
		if (width > 0 && height > 0) {
			// Si c'est bien le cas alors on passe notre booléen de retour à
			// vrai.
			inputsValid = true;
		} else if (width <= 0) {
			// Cas ou la largeur n'est pas correcte.
			throw new WrongInputException("La largeur saisie n'est pas valide.");
		} else {
			// Cas ou la hauteur n'est pas correcte.
			throw new WrongInputException("La hauteur saisie n'est pas valide.");
		}
		return inputsValid;
	}

	/**
	 * Méthode permettant de demander à l'utilisateur si l'application doit
	 * calculer le périmètre ou la surface du rectangle.
	 *
	 * @return boolean vrai si il faut calculer le périmètre, faux si il faut
	 *         calculer la surface.
	 * @throws WrongInputException
	 *             si l'utilisateur n'a pas effectué une saisie correcte pour
	 *             choisir le type de calcul à faire.
	 */
	private static boolean isPerimeterCalculation() throws WrongInputException {
		boolean isPerimeter = true;
		Main.log("Surface ('s/S') ou périmètre ('p/P') ? ");
		String input = Main.scanner.next();
		// Utilisation de la méthode matches() de la classe String. Cette
		// méthode permet de vérifier si le chaine de caractères correspond à
		// une expression régulière donnée.
		if (input.matches("[sS]")) {
			// Si l'utilisateur a saisi 's' ou 'S', alors ce n'est pas le
			// périmètre mais la surface qu'il veut calculer.
			isPerimeter = false;
		} else if (!input.matches("[pP]")) {
			// Si on est dans ce cas, l'utilisateur n'a saisi ni 's' ou 'S', ni
			// 'p' ou 'P'. Il y a donc une erreur car l'application attend
			// forcément l'un ou l'autre. Comme il y a une erreur, on lève une
			// exception correspondant à cette erreur.
			throw new WrongInputException("Le choix saisi n'est pas correcte.");
		}
		return isPerimeter;
	}

	/**
	 * Méthode d'affichage permettant de ne pas répéter System.out.println()
	 * partout dans l'application. Si à l'avenir, on veut changer l'endroit où
	 * est fait l'affichage, il n'y aura que le contenu de cette méthode à
	 *
	 * @param message
	 *            le message à afficher.
	 */
	public static void log(String message) {
		System.out.print(message);
	}

	/**
	 * Méthode d'affichage similaire à log() permettant d'afficher des erreurs
	 * en rouge sur la sortie d'erreur standard.
	 *
	 * @deprecated Cette méthode ne doit plus être utilisée. A la place il faut
	 *             lever une nouvelle exception.
	 * @param message
	 *            le message d'erreur à afficher.
	 */
	// Annotation permettant de signifier à la personne qui veut utiliser cette
	// méthode que son utilisation est déconseillée. La plupart du temps cette
	// annotation sert à prévenir que la méthode sera supprimée dans une future
	// version. Vous remarquerez qu'Eclipse barre le nom des méthodes
	// dépréciées.
	@Deprecated
	public static void logError(String message) {
		System.err.println("Erreur : ".concat(message));
	}

	/**
	 * Point d'entrée de l'application.
	 *
	 * @throws WrongInputException
	 */
	public static void main(String args[]) throws WrongInputException {
		// Lecture et récupération de la largeur.
		double width = Main.readInput("largeur");
		// Lecture et récupération de la longueur.
		double height = Main.readInput("hauteur");

		// Vérification des données saisies. Si une données n'est pas correcte,
		// une exception sera levée. Comme il n'y a pas de bloc try/catch, cela
		// signifie que l'on sortira immédiatement de notre méthode main(), et
		// donc de notre application (car main() est le point d'entrée).
		Main.checkInputs(width, height);
		// Instance d'un nouveau rectangle.
		Rectangle rectangle = new Rectangle(width, height);
		// Récupération de l'information sur le type de calcul à faire
		// (périmètre ou sinon surface).
		if (Main.isPerimeterCalculation()) {
			// Affichage du périmètre.
			Main.log("Le périmètre est de "
					.concat(rectangle.calculatePerimeter().toString().concat("m\n")));
		} else {
			// Sinon affichage de la surface.
			Main.log("La surface est de "
					.concat(rectangle.calculateSurface().toString().concat("m²\n")));
		}
	}

	/**
	 * Lecture de la saisie d'un nombre réel.
	 *
	 * @param input
	 *            le libellé à utiliser.
	 * @return Double le nombre réel saisi.
	 */
	private static Double readInput(String input) {
		Double result = null;
		Main.log("Entrez la ".concat(input).concat(": "));
		// Récupération d'un double convertit implicitement en Double (wrapper).
		// Cette conversion spécifique entre un type primitif et son wrapper
		// correspondant est appelé boxing/unboxing en Java.
		result = Main.scanner.nextDouble();
		return result;
	}
}
