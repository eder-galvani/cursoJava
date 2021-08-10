package controle;

import java.util.Scanner;

/**
 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
 * "Recuperação", caso contrário imprime no console "Reprovado".
 */

public class Exercicio3EstruturasControle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		if (media >= 7 && media < 10) {
			System.out.println("Sua média foi " + media + " e você está Aprovado!");
		} else if (media < 7 && media > 4) {
			System.out.println("Sua média foi " + media + " e você está de Recuperação!");
		} else if (media < 4) {
			System.out.println("Sua média foi " + media + " e você está Reporvado!");
		} else if (media > 10) {
			System.out.println("Notas Inválidas");
		}
		
		entrada.close();
	}
}
