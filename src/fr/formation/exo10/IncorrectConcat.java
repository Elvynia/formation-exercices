package fr.formation.exo10;

/**
 * Démonstration d'une tentative de modification de String incorrecte.
 *
 * @author hb-asus
 *
 */
public class IncorrectConcat {

	/**
	 * Dans cette méthode, l'opérateur '+=' produit implicitement un 'new
	 * String()' et de ce fait le String 's' en dehors de la méthode n'est pas
	 * du tout modifié.
	 *
	 * @param s
	 *            la première chaine à concaténer.
	 * @param s2
	 *            la deuxième chaine à concaténer.
	 */
	public static void concat(String s, String s2) {
		s += s2;
	}

	public static void main(String args[]) {
		String s = "China Blue";
		System.out.println(s);
		IncorrectConcat.concat(s, " Express");
		System.out.println(s);
	}
}
