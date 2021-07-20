package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		//o do While garante que o c�digo ser� executado pelo menos uma vez
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por Favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}
}
