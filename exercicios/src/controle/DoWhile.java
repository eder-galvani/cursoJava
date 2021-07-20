package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		//o do While garante que o código será executado pelo menos uma vez
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por Favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}
}
