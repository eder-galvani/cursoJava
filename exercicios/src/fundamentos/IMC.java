package fundamentos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Olá! Digite o seu Peso em kg: ");
		double peso = entrada.nextDouble();
		System.out.print("Olá! Digite sua altura em cm: ");
		double alt = entrada.nextDouble();

		double imc = (peso / (Math.pow(alt, 2))) * 10000;
		entrada.close();
		System.out.println("O seu IMC é: " + imc);

		if (imc < 18.5) {
			System.out.println("MAGREZA");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("NORMAL");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("SOBREPESO");
		} else if (imc >= 30.0 && imc <= 39.9) {
			System.out.println("OBESIDADE");
		} else if (imc > 40.0) {
			System.out.println("OBESIDADE GRAVE");
		}

	}

}
