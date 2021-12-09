package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Gol;

public class CarroTeste {

	public static void main(String[] args) {
		Carro ferrari = new Ferrari(400);
		Carro gol = new Gol();
		
		gol.acelerar();
		gol.acelerar();
		gol.frear();
		System.out.println("Velocidade do Gol =>" + gol.velocidadeAtual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		
		System.out.println("Velocidade da Ferrari =>" + ferrari.velocidadeAtual);
	}
}
