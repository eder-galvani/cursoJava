package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
//	switch sem break executa todos os comandos abaixo dele
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sadan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim!");

		int idade = 3;

		switch (idade) {
		case 3:
			System.out.println("Sabe Programar");
		case 2:
			System.out.println("Sabe Falar");
		case 1:
			System.out.println("Sabe Andar");
		case 0:
			System.out.println("Sabe Respirar");
		}
	}
}
