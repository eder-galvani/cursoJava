package controle;

public class For1 {

	public static void main(String[] args) {
		/*
		 * int contador = 1; while (contador <= 10) { System.out.printf("i = %d\n",
		 * contador); contador++;
		 */
		
		//for (declara��o da vari�vel; express�o que retorna true ou false; contador++)
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}

//		� poss�vel mas � melhor usar o while nesse caso
//		int x =2;
//		for(; x < 10;) {
//			System.out.println("x = " + x);
//			x++;
//		}

//		La�o infinito
//		for(;;) {
//			System.out.println("Fim!");
//		}

	}
}
