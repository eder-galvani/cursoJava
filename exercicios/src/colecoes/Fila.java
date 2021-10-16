package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer quando a fila esta cheia retorna false em vez de erro e não adiciona o elemento na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element > obter o próximo elemento da fila sem remover
		System.out.println(fila.peek()); // retorna null caso não exista itens na fila
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna erro caso não exista itens na fila
		System.out.println(fila.element());
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpar a fila
		//fila.isEmpty(); saber se a fila esta vazia
		//fila.contains("Ana"); saber se um item esta na fila
		
		System.out.println(fila.poll()); //retorna o primeiro elemento da fila ja removendo da fila
		System.out.println(fila.poll()); //retorna null caso não tenha mais elementos para remover da fila
		System.out.println(fila.remove()); //igual ao pool, porém se mandar remover sem ter itens na fila retorna erro
						
	}
	
}
