package fr.formation.exo11;

/**
 * Enumération des entêtes du fichier de données CSV comportant la référence des
 * ustensiles.
 * 
 * @author Arcanis
 *
 */
public enum HEADER {
	TYPE("Type"), YEAR("Annee"), SCORE("Cote");

	private String title;
	
	private HEADER(final String title) {
		this.title = title;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
}
