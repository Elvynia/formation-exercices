package fr.formation.exo2.objets;

import java.util.Date;

/**
 * Classe abstraite permettant de pré-définir les caractéristiques d'un employé
 * et les actions possibles. Cette classe étant abstraite, il est strictement
 * impossible de faire une nouvelle instance de cette classe ("new
 * Employee(...)" ne compilera pas).
 *
 * @author hb-asus
 *
 */
public abstract class Employee implements Payrole {
	// Propriétés communes à tous les employés.
	public int age;
	public String firstName;
	public Date hireDate;
	public String name;

	/**
	 * Constructeur.
	 *
	 * @param name
	 *            le nom de l'employé.
	 * @param firstName
	 *            le prénom de l'employé.
	 * @param age
	 *            l'age de l'employé.
	 * @param hireDate
	 *            la date à laquelle l'employé a été embauché.
	 */
	public Employee(String name, String firstName, int age, Date hireDate) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.hireDate = hireDate;
	}

	/**
	 * Méthode permettant de récupérer une chaine de caractère représantant le
	 * nom de l'employé utilisé uniquement pour l'affichage.
	 *
	 * @return String l'affichage à utiliser pour cet employé.
	 */
	public String getName() {
		return "L'employé ".concat(this.name).concat(" ").concat(this.firstName);
	}
}
