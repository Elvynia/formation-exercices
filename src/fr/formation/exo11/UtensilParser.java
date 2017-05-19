package fr.formation.exo11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import fr.formation.exo11.utensil.RoundPlate;
import fr.formation.exo11.utensil.Spoon;
import fr.formation.exo11.utensil.SquarePlate;
import fr.formation.exo11.utensil.Utensil;

/**
 * Classe permettant de récupérer les données des ustensiles depuis un fichier
 * CSV afin de les transformer en objets Java.
 * 
 * @author Arcanis
 *
 */
public class UtensilParser implements Parser {

	private static final String CSV_SEPARATOR = ",";
	private final String filePath;
	private final List<Utensil> utensils;

	public UtensilParser(final String filePath) {
		this.filePath = filePath;
		this.utensils = new ArrayList<>();
	}

	@Override
	public void run() {
		final File csvFile = new File(this.filePath);
		try (final BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(csvFile), "UTF-8"))) {
			String line = "";
			boolean firstLine = true;
			Map<HEADER, Integer> headers = null;
			// while ((line = reader.readLine()) != null) {
			while (line != null) {
				if (!line.isEmpty()) {
					final String[] cells = line.split(UtensilParser.CSV_SEPARATOR);
					if (firstLine) {
						// Récupérer les entêtes.
						headers = this.fetchHeaders(cells);
						firstLine = false;
					} else {
						// Récupérer les informations des ustensiles.
						this.utensils.add(this.fetchUtensil(cells, headers));
					}
				}
				line = reader.readLine();
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private Utensil fetchUtensil(String[] cells, Map<HEADER, Integer> headers) {
		Utensil utensil = null;
		for (final Entry<HEADER, Integer> entry : headers.entrySet()) {
			switch (entry.getKey()) {
			case TYPE:
				utensil = createUtensil(cells[entry.getValue()]);
				break;
			case YEAR:
				utensil.year = Integer.parseInt(cells[entry.getValue()]);
				break;
			case SCORE:
				final double score = Double.parseDouble(cells[entry.getValue()]);
				utensil.setScore(score);
			}
		}
		return utensil;
	}

	private Utensil createUtensil(String type) {
		if ("Assiette carrée".equalsIgnoreCase(type)) {
			return new SquarePlate();
		} else if ("Assiette ronde".equalsIgnoreCase(type)) {
			return new RoundPlate();
		} else if ("cuillère".equalsIgnoreCase(type)) {
			return new Spoon();
		} else {
			System.err.println("Aucun type correspondant pour la donnée '" + type + "'");
		}
		return null;
	}

	private Map<HEADER, Integer> fetchHeaders(String[] cells) {
		final Map<HEADER, Integer> headers = new TreeMap<>();
		for (final HEADER header : HEADER.values()) {
			int index = -1;
			for (final String cell : cells) {
				if (header.getTitle().equals(cell)) {
					index = Arrays.asList(cells).indexOf(cell);
					break;
				}
			}
			if (index >= 0) {
				headers.put(header, index);
			} else {
				System.err.println("L'entête " + header.getTitle() + " n'a pas été trouvé dans le fichier CSV.");
				System.exit(1);
			}
		}
		return headers;
	}

	@Override
	public List<Utensil> getResults() {
		return this.utensils;
	}

}
