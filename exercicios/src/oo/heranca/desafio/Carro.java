package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADEMAXIMA;
	public int velocidadeAtual;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADEMAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			velocidadeAtual += getDelta();
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

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
