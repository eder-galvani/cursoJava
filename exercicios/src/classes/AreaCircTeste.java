package classes;

public class AreaCircTeste {

	public static void main(String[] args) {
		// AreaCirc.pi = 3.1415; // forma correta de alterar o valor de pi caso não seja
		// uma constante, mas também será alterado para todos
		// os objetos criados a partir dessa classe.

		AreaCirc a1 = new AreaCirc(10);
		// a1.pi = 10; caso isso seja feito, estaremos alterando o valor do pi na
		// classe, para todos os objetos, pois o pi é static
		a1.raio = 10;
		System.out.println(a1.area());

		AreaCirc a2 = new AreaCirc(5);
		// a2.pi = 5;
		a2.raio = 100;
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		System.out.println(AreaCirc.area(100)); //como foi criado um método static podemos chamar direto sem precisar inicializar um objeto/instancia

	}

}
