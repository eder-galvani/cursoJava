package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(++a == b--); // primeiro incremeta o "a" depois compara com "b" e só depois decrementa o "b"
		System.out.println(a == b);
		
	}

}
