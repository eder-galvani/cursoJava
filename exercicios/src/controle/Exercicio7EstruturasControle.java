package controle;

import java.util.Scanner;

public class Exercicio7EstruturasControle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		/* 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
		 * caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */
		int numero = 0;
		int total = 0;
		
		while (numero >= 0){			
				System.out.print("Informe um número: ");
				numero = entrada.nextInt();
				if (numero >= 0) {
				total = total + numero;
				System.out.println("O total é: " + total);
			}
		}
		System.out.println("Obrigado!");
		 entrada.close();
	}
}

/* Resposta do Professor
 * package controle;

import java.util.Scanner;

public class Exercicio7 {
	/**
	 * 7. Criar um programa que enquanto estiver recebendo números positivos,
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = scanner.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}
		scanner.close();
	}

}
 * 
 * 
 * 
 * */