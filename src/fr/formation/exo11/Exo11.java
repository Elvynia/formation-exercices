package fr.formation.exo11;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.formation.exo11.domain.Utensil;
import fr.formation.exo11.parser.CsvParser;

public class Exo11 implements Runnable {

	private static final Logger LOGGER = LoggerFactory.getLogger(Exo11.class);

	public static void main(String[] args) {
		new Exo11(args).run();
	}

	private String path;
	private boolean virtual;

	public Exo11(String[] args) {
		if (args.length == 0) {
			this.showUsage();
			throw new IllegalArgumentException(
					"Impossible de lancer l'application sans paramètres (c.f. usage).");
		}
		this.path = args[0];
		if (args.length > 1) {
			this.virtual = Boolean.parseBoolean(args[1]);
		}
	}

	private void showUsage() {
		LOGGER.info("Usage : Exo11 path_to_data [virtual]");
		LOGGER.info("\t path_to_data : chemin physique sur le disque dur "
				+ "ou virtuel dans le classpath.");
		LOGGER.info(
				"\t virtual : true|false si le chemin est de type classpath.");
	}

	@Override
	public void run() {
		final CsvParser parser = new CsvParser();
		parser.loadData(this.path, this.virtual);
		List<Utensil> toPrint = parser.parse();
		LOGGER.info("Données chargée par le parseur : ");
		LOGGER.info(toPrint.toString());
	}
}
