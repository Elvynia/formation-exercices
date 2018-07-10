package fr.formation.exo11;

public enum HEADER {
	TYPE("Type"), YEAR("Année"), SCORE("Cote");

	public final String column;

	private HEADER(String column) {
		this.column = column;
	}
}
