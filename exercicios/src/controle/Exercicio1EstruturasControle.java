package controle;

import java.util.Scanner;

public class Exercicio1EstruturasControle {
	
	/**
	 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
	 * 10 e é par;
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int valor = entrada.nextInt();

		switch (valor) {
		case 10:
		case 8:
		case 6:
		case 4:
		case 2:
		case 0:
			System.out.println("Número está entre 0 e 10 e é Par");
			break;
		case 9:
		case 7:
		case 5:
		case 3:
		case 1:
			System.out.println("Número está entre 0 e 10 e não é Par");
			break;
		default:
			System.out.println("Número não está entre 0 e 10");
			entrada.close();
		}
		
		//forma do professor
		/*
		 * if (numero >= 0 && numero <= 10) { 
		 * 		if (numero % 2 == 0) {
		 * 			System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
		 * } else { 
		 * 			System.out.println("O numero " + numero +
		 * " está entre 0 e 10 mas não é um par."); }
		 *  } else {
		 *			 System.out.println("O numero " + numero + " não está entre 0 e 10."); }
		 * 
		 * scanner.close(); }
		 */	
		}
}
