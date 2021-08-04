package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// se for impar
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i); // imprime números pares
		}
		// imprime de 1 a 10 sem o 5
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
	}
}