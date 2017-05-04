package fr.formation.exo5;

public class ComplexNumber {

	public int i;
	public int x;

	public ComplexNumber() {
	}

	public ComplexNumber(final int x) {
		this.x = 0;
	}

	public ComplexNumber(final int x, final int i) {
		this(x);
		this.i = i;
	}

	@Override
	public String toString() {
		return this.x + " + " + (this.i != 0 ? this.i + "i" : "");
	}
}
