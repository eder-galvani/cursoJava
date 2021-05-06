package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;

		boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;

		System.out.println("Comprou TV 50 polegadas? " + comprouTv50);
		System.out.println("Comprou TV 32 polegadas? " + comprouTv32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Ficamos em Casa? " + !comprouSorvete);

	}
}
