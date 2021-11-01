package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 0;

	boolean acelerar() {
		velocidadeAtual = velocidadeAtual + 5;
		return true;
	}

	boolean frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual = velocidadeAtual - 5;
			return true;
		} else {
			velocidadeAtual = 0;
			return true;
		}

	}
}
