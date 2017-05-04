package fr.formation.exo6;

/**
 * Exception permettant de gérer les cas d'erreurs dans lesquels l'utilisateur
 * n'a pas effectué une bonne saisie.
 *
 * @author hb-asus
 *
 */
public class WrongInputException extends Exception {

	/**
	 * Serial UUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur avec message.
	 *
	 * @param message
	 *            le message d'erreur lié au contexte dans lequel cette
	 *            exception est levée (la cause de l'exception).
	 */
	public WrongInputException(String message) {
		super(message);
	}

	/**
	 * Constructeur avec message, à partir d'une exception déjà levée ailleurs
	 * dans l'application.
	 *
	 * @param message
	 * @param t
	 */
	// La classe Throwable regroupe tous les types d'exceptions et d'errors en
	// Java. Elle correspond aussi à tout objet avec lequel on peut utiliser les
	// instructions throw et throws.
	public WrongInputException(String message, Throwable t) {
		super(message, t);
	}
}
