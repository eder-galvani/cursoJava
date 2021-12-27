package classes;

public class Equals {
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";

		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2)); // true
		System.out.println(u2.equals(u1)); // true

	//	System.out.println(u2.equals(new Date()));
	}
		// O  hashcode será abordado em outra aula!
	public int hashcode() {
		return 0;
	}
}










