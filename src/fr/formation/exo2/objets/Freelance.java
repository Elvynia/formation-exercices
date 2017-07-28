package fr.formation.exo2.objets;

import java.util.ArrayList;
import java.util.List;

import fr.formation.exo2.Constants;

public class Freelance implements Payrole {
	
	private String name;
	
	private String siren;

	private final List<Invoice> invoices;
	
	public Freelance() {
		this.invoices = new ArrayList<>();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int calculateSalary() {
		int result = 0;
		for (final Invoice invoice : this.invoices) {
			if (!invoice.getLabel().startsWith(Constants.TRAVEL_FEES)) {
				result += invoice.getTotal();
			}
		}
		return result;
	}

	public String getName() {
		return "L'indépendant " + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}
	
}
