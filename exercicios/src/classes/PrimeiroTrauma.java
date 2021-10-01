package classes;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;

	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma(); // necessário instanciar pra acessar a variável a fora do main
		System.out.println(p.a);

		System.out.println(b); // aqui foi possível pois a variável b é estatica também, assim como o main
	}
}
