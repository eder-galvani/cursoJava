package classes;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25 ;
	//não precisa de parametros quando a classe ja tem tudo que precisamos para o calculo
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
