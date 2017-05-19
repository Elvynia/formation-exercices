package fr.formation.exo11;

import java.util.List;

import fr.formation.exo11.utensil.Utensil;

/**
 * Définition d'un parseur d'ustensiles.
 * 
 * @author Arcanis
 *
 */
public interface Parser extends Runnable {

	/**
	 * Récupération des ustensiles parsés.
	 * 
	 * @return List<Utensil>
	 */
	public List<Utensil> getResults();
}
