package controle;

public class BreakRotulado {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
// se não usar o rotulo o break sai do laço mais interno, usando o rótulo ele sai do rótulo indicado
				if (i == 1) {
					break externo;
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
