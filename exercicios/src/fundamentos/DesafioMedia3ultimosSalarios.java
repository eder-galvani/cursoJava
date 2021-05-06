package fundamentos;

import java.util.Scanner;

public class DesafioMedia3ultimosSalarios {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu primeiro salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite seu segundo salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite seu terceiro salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");

		entrada.close();

		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);

		double media = (double) (sal1 + sal2 + sal3) / 3;

		System.out.println("A média do seu salário dos últimos 3 meses é: R$" + media);

	}

}
