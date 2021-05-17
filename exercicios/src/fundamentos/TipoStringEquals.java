package fundamentos;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2"); 
		System.out.println("2" == s); // false
		System.out.println("2".equals(s)); // true // sempre que for comparar string utilizar o equals.
		
	}
}	

