package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// pega a letra na posi��o informada
		System.out.println("Ol� Pessoal".charAt(2));

		String s = "Boa tarde";
		// Retorna boolean se a string come�a com o texto informado
		System.out.println(s.startsWith("Boa"));
		// Converte tudo em minuscula para depois comparar
		System.out.println(s.toLowerCase().startsWith("boa"));
		// Retorna o tamanho do texto
		System.out.println(s.length());
		// Compara se o valor � igual
		System.out.println(s.equals("boa tarde"));
		// Compara se o valor � igual, ignorando maiusculas e minusculas
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12000.523;

		System.out.println(
				"Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSal�rio: " + salario + "\n\n");
		// ou
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		// %s para substituir por string - %d para inteiros
		// %f para float e %2.f para informar quantas cass decimais seram exibidas.
		// ou
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		// Verifica se na frfase cont�m o texto
		System.out.println(frase.contains("senhor"));
		// a partir de qual posi��o come�a o texto informado
		System.out.println(frase.indexOf("senhor"));
		// exibe a partir do index selecionado
		System.out.println("Frase qualquer".substring(6));
		// exibe a partir do index selecionado, at� o final informado (caractere
		// anterior ao �ltimo)
		System.out.println("Frase qualquer".substring(6, 8));
	}

}