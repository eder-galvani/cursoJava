package controle;

/*6. Jogo da adivinhação:Tentar adivinhar um número entre 0-100. 
 * Armazene um numero aleatório em uma variável.
 * O Jogador tem 10 tentativas para adivinhar o número gerado.
 * Ao final de cada tentativa,imprima a quantidade de tentativas restantes,
 * e imprima se o número inserido é maior ou menor do que o número armazenado.
 */

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio6EstruturasControle {

	public static void main(String[] args) {
		Random random = new Random();
		int numero = random.nextInt(100);
		//System.out.println(numero);
		int i = 1;
		for (; i <= 10; i++) {
			int resposta = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o número"));
			if (resposta == numero) {
				System.out.println("Parabéns, número correto");
				break;
			} else if (resposta < numero) {
				System.out.println("Tente outra vez com um número maior. Tentativa " + i);
			} else if (resposta > numero) {
				System.out.println("Tente outra vez com um número menor. Tentativa " + i);
			}
		}
		if (i > 10) {
			System.out.println("Você Perdeu. Tente novamente!");
			System.out.println("O número era: " + numero);
		}
	}
}

/* resposta do professor:

	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo! Sera que consegue me vencer?");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = scanner.nextInt();

				if (numero > numeroSorteado) {

					System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

				} else if (numero < numeroSorteado) {

					System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);

				} else {

					System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);

				}

			} while (numero != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = scanner.nextInt();

		} while (continuar != 0);

		scanner.close();
	}
}*/
