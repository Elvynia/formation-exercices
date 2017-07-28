package fr.formation.exo2.objets;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe permettant de gérer une collection d'employés.
 *
 * @author hb-asus
 *
 */
public class Staff {

	/**
	 * Déclaration d'une propriété de type Collection avec le type d'éléments
	 * Employee. Nous utilisons ici notre classe abstraite afin de pouvoir gérer
	 * tous les employés de la même manière sans faire de différence sur
	 * l'implémentation utilisée.
	 */
	public Collection<Payrole> employees;

	/**
	 * Constructeur par défaut.
	 */
	public Staff() {
		this.employees = new ArrayList<>();
	}

	/**
	 * Méthode permettant d'ajouter un employé à la collection.
	 *
	 * @param employee
	 */
	public void addEmployee(Payrole employee) {
		this.employees.add(employee);
	}

	/**
	 * Méthode permettant d'afficher le nom et le salaire de chaque employé.
	 *
	 * @return String l'affichage de la liste des employés.
	 */
	public String displaySalaries() {
		// Utilisation de la classe Java StringBuffer. Cette classe permet de
		// construire de longues, voir très longues chaînes de caractères. La
		// classe possède une méthode append() pour chaque type primitif, il
		// n'est donc pas nécessaire d'utiliser Integer.valueOf() pour
		// transformer le salaire (qui est un int) en String.
		// Il existe aussi une classe quasiment identique StringBuilder. La
		// seule différence entre ces deux classes est que StringBuilder utilise
		// des méthodes synchronisés. Nous verrons plus tard la signification de
		// la synchronicité dans le code Java.
		StringBuffer buffer = new StringBuffer();
		// Utilisation de append avec un objet String.
		buffer.append("Liste des salaires des employés :\n");
		for (Payrole employee : this.employees) {
			// Utilisation de append avec un type primitif char.
			buffer.append('\t');
			buffer.append(employee.getName());
			buffer.append(" a un salaire de ");
			// Utilisation de append avec un type primitif int.
			buffer.append(employee.calculateSalary());
			buffer.append('\n');
		}
		// Ici, la méthode toString() permet de demander à notre buffer de
		// prendre tous les éléments passés par les appels aux méthodes append()
		// et de créer, instancier un String une seule fois (et non à chaque
		// fois qu'il y a une concaténation).
		return buffer.toString();
	}

	/**
	 * Méthode permettant de calculer le salaire moyen des employés de la
	 * société.
	 *
	 * @return int le salaire moyen.
	 */
	public int getAverageSalary() {
		int total = 0;
		for (Payrole employee : this.employees) {
			// Utilisation de l'opérateur += qui équivaux à variable = variable
			// + salaire. Cet opérateur permet simplement de ne pas avoir à
			// répéter le nom de la variable.
			total += employee.calculateSalary();
		}
		return total / this.employees.size();
	}
}
