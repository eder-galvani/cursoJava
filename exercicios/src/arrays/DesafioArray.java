package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite quantas notas serão calculadas: ");
		int quantNotas = entrada.nextInt();

		double[] notas = new double[quantNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota: "); //System.out.print("Digite a nota" + (i + 1) + ": ")
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		entrada.close();

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		System.out.print("Sua média é: " + total / notas.length);
	}
}

