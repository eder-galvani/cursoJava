package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next();

		if ("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("Equivale ao dia 1 da semana");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Equivale ao dia 2 da semana");
		} else if ("Terça".equalsIgnoreCase(dia) || "Terca".equalsIgnoreCase(dia)) {
			System.out.println("Equivale ao dia 3 da semana");
		} else if ("Quarta" == dia.intern()) {
			System.out.println("Equivale ao dia 4 da semana");
		} else if ("Quinta" == dia.intern()) {
			System.out.println("Equivale ao dia 5 da semana");
		} else if ("Sexta" == dia.intern()) {
			System.out.println("Equivale ao dia 6 da semana");
		} else if ("Sábado" == dia.intern()) {
			System.out.println("Equivale ao dia 7 da semana");
		} else {
			System.out.println("Dia Inválido");
		}

		entrada.close();

	}

}
