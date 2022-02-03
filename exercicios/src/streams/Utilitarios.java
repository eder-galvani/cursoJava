package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	private Utilitarios() { //construtor privado para ninguém instanciar a classe.
		
	}

	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
	
	public final static String grito(String n) {
		return n + "!!! ";
	}
	
	
}
