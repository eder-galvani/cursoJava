package fundamentos.operadores;

public class Desafiooperadores {
	public static void main(String[] args) {
		double a = 6 * (3 + 2);
		double b = Math.pow(a, 2);
		double c = 3 * 2;
		double d = b / c;

		double e = (1 - 5) * (2 - 7) / 2;
		double f = Math.pow(e, 2);

		double g = d - f;
		double h = Math.pow(g, 3);

		double i = Math.pow(10, 3);

		System.out.println(h / i);

	}
}
