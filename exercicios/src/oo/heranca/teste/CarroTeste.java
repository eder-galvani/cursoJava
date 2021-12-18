package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Gol;

public class CarroTeste {

	public static void main(String[] args) {
				
		Gol c1 = new Gol();
		
		c1.acelerar();
		System.out.println("Velocidade do Gol =>" + c1.velocidadeAtual);
		
		c1.acelerar();
		System.out.println("Velocidade do Gol =>" + c1.velocidadeAtual);
		
		c1.frear();
		System.out.println("Velocidade do Gol =>" + c1.velocidadeAtual);
		
		Ferrari ferrari = new Ferrari(400);
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.acelerar();
		System.out.println("Velocidade da Ferrari =>" + ferrari.velocidadeAtual);

		ferrari.acelerar();
		System.out.println("Velocidade da Ferrari =>" + ferrari.velocidadeAtual);
		
		ferrari.acelerar();
		System.out.println("Velocidade da Ferrari =>" + ferrari.velocidadeAtual);

		ferrari.frear();
		System.out.println("Velocidade da Ferrari =>" + ferrari.velocidadeAtual);
		
	}
}
