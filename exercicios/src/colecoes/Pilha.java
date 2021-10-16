package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe"); //retorna um valor boleano
		livros.push("Dom Quixote"); // retorna exceção caso não caiba na pilha
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println("for " + livro);
		}
		
		System.out.println(livros.peek()); //retorna o último livro adicionado sem remover
		System.out.println(livros.element());
		
		System.out.println(livros.pop());// remove o ultimo da pilha, e da exceção caso não tenha itens na pilha
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());// acabando a pilha retorna null
		
		
		
		
		
	}

}
