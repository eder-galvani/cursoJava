package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADEMAXIMA;
	public int velocidadeAtual;
	protected int delta = 5;

		
	protected Carro(int velocidadeMaxima) {
		VELOCIDADEMAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	public boolean frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual = velocidadeAtual - 5;
			return true;
		} else {
			velocidadeAtual = 0;
			return true;
		}

	}
}
