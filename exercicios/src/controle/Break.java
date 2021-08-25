package controle;

public class Break {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				break; // Break encerra/desvia o fluxo e sai pra linha 15
			}

			System.out.println(i);

			
		}
		System.out.println("Fim!");
	}
}
