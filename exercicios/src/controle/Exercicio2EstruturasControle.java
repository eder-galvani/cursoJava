package controle;

import java.util.Scanner;

public class Exercicio2EstruturasControle {

	public static void main(String[] args) {

		// 2. Criar um programa informa se o ano atual é um ano bissexto;

		Scanner entrada = new Scanner(System.in);
		int ano;

		System.out.println("Digite um ano para saber se é bissexto: ");
		ano = entrada.nextInt();

		// se o ano for maior que 400
		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
			// se o ano for menor que 400
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto");
		}
		entrada.close();
	}
}


/* Resposta do professor
 * System.out.println("Digite o ano: ");
int ano = scanner.nextInt();

int bissexto = ano % 4;

if (bissexto == 0) {
	System.out.println(ano + " é um ano bissexto");
} else {
	System.out.println(ano + " não é um ano bissexto");
}
scanner.close();
}

} */
