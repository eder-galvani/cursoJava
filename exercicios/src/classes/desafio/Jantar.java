package classes.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("feijao", 0.100);
		Comida c2 = new Comida("arroz", 0.400);
		
		Pessoa p1 = new Pessoa("João", 82.00);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
	}
}
