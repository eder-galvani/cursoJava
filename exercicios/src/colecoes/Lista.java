package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList <>();
		
		//cria o usuário a adiciona na lista
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		//cria o usuário já adcicionando na lista
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//System.out.println(lista.get(3).nome); //pesquisa o usuário pelo indice
		System.out.println(lista.get(3)); // acessa pelo índice. Como foi implementado o método toString ele ja imprime o nome.
	
		//lista.remove(1); //remove o Carlos pelo índice
		System.out.println(">>>>>" + lista.remove(1)); //devolve o objeto retornado
		System.out.println(lista.remove(new Usuario("Manu"))); // remove e devolve true
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); //devolve true pq o usuário existe na lista
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		
	}
}
