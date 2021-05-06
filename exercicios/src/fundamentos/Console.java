package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// imprime no console sem quebrar a linha
		System.out.print("bom ");
		System.out.print("dia");

		// imprime quebrando a linha
		System.out.println("bom");
		System.out.println("dia");

		// imprime formatando
		System.out.printf("Nome: %s \n", "João");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.println("Nome: " + nome + " " + sobrenome + " - " + "Idade: " + idade);

		entrada.close();

	}

}
