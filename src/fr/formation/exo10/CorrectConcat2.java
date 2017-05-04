package fr.formation.exo10;

/**
 * Solution 2 pour pouvoir modifier correctement la chaine 's'.
 *
 * @author hb-asus
 *
 */
public class CorrectConcat2 {

	/**
	 * Version corrigée de la méthode qui utilise un StringBuffer et sa méthode
	 * append() pour éviter de faire une nouvelle instance de String comme avec
	 * l'opérateur '+='.
	 *
	 * @param s
	 *            la première chaine à concaténer.
	 * @param s2
	 *            la deuxième chaine à concaténer.
	 */
	public static void concat(StringBuffer s, String s2) {
		s.append(s2);
	}

	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("China Blue");
		System.out.println(s);
		CorrectConcat2.concat(s, " Express");
		System.out.println(s);
	}
}
