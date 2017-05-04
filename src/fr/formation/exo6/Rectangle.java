package fr.formation.exo6;

/**
 * Classe représentant une forme mathématique de rectangle capable de calculer
 * son périmètre et sa surface en fonction de sa largeur et de sa hauteur.
 *
 * @author hb-asus
 *
 */
public class Rectangle {

	private double height;
	private double width;

	Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	/**
	 * Calcul du périmètre d'un rectangle.
	 *
	 * @return Double la valeur du périmètre calculée.
	 */
	Double calculatePerimeter() {
		return 2 * (this.width + this.height);
	}

	/**
	 * Calcul de la surface d'un rectangle.
	 *
	 * @return Double la valeur de la surface calculée.
	 */
	Double calculateSurface() {
		return this.width * this.height;
	}

}
