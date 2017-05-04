package fr.formation.exo3;

class Alphabet {
	public static void main(String args[]) {
		A[] as = new A[3];
		as[0] = new A(1);
		as[1] = new B(2);
		as[2] = new C(3);

		for (int i = 0; i < as.length; i++) {
			as[i].afficherClasse();
			System.out.println("-----");
		}

		for (int i = 0; i < as.length; i++) {
			as[i].afficherVariables();
			System.out.println("-----");
		}
	}
}