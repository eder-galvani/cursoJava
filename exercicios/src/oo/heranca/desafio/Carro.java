package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADEMAXIMA;
	int velocidadeAtual;
	int delta = 5;

		
	Carro(int velocidadeMaxima) {
		VELOCIDADEMAXIMA = velocidadeMaxima;
	}

	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			velocidadeAtual += delta;
		}
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
