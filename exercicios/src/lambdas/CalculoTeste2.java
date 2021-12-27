package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// não utiliza as classes Somar e Multiplicar
		
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; // sem o par de chaves não precisa da palavra "return"
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
		
		
	}
}
