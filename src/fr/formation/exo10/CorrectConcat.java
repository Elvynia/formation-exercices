package fr.formation.exo10;

/**
 * Solution 1 pour pouvoir modifier correctement la chaine 's'.
 *
 * @author hb-asus
 *
 */
public class CorrectConcat {

	/**
	 * Version corrigée de la méthode qui renvoi la nouvelle chaine de caractère
	 * produite par l'opérateur '+='.
	 *
	 * @param s
	 *            la première chaine à concaténer.
	 * @param s2
	 *            la deuxième chaine à concaténer.
	 * @return String la nouvelle chaine.
	 */
	public static String concat(String s, String s2) {
		return s += s2;
	}

	public static void main(String args[]) {
		String s = "China Blue";
		System.out.println(s);
		// Il ne faut pas oublier de stocker la nouvelle chaine produite dans
		// notre variable 's' pour que cela fonctionne.
		s = CorrectConcat.concat(s, " Express");
		System.out.println(s);
	}
}
