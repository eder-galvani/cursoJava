package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
// se não usar o rotulo o continue sai do laço mais interno, usando o rótulo ele sai do rótulo indicado
				if (i == 1) {
					continue externo;
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
