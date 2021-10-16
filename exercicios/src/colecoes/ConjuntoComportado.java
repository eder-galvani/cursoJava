package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set <String> listaAprovados = new HashSet<>(); //<String> informa o tipo de dados que vai conter na lista
		SortedSet <String> listaAprovados = new TreeSet<>(); //garante a ordem dos dados informados na sessão
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for(String candidato: listaAprovados) {
		System.out.println(candidato);
		}
		
		Set <Integer> nums = new HashSet<>(); 
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// nums.get(1); não é possível acessar pelo índice
		
		for(int numeros: nums) {
			System.out.println(numeros);
			}
	}
}
