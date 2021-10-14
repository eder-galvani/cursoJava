package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste"); // não add porque o valor é repetido com a linha 12
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); //não remove pq o valor não existe na colection
		System.out.println(conjunto.remove("Teste")); // remove da colection
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));

		Set nums = new HashSet(); //dessa forma também pode ser feito

		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //união entre dois conjuntos
		conjunto.retainAll(nums); //junta só o que os conjuntos tem em comum
		System.out.println(conjunto);

		conjunto.clear(); // limpa o conjunto
		System.out.println(conjunto);

		

		
	}
}
