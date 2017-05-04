package fr.formation.exo5;

public class Main {

	public static void main(String args[]) {
		int i = 0;
		ComplexNumber j = new ComplexNumber(3, 2);
		Main.modifyPrimitive(i);
		Main.modifyObject(j);
		System.out.println("Valeur de i : " + i);
		System.out.println("Valeur de j : " + j);
	}

	static void modifyObject(ComplexNumber number) {
		number.x = 50;
	}

	static void modifyPrimitive(int i) {
		i = 50;
	}
}
