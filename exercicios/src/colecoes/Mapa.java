package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); //adiciona um registro
		//usuarios.put(1, "Ricardo"); //altera o registro pela chave
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());// não conta as chaves repetidas
		
		System.out.println(usuarios.keySet()); // retorna todas as chaves sem ordenação
		System.out.println(usuarios.values()); // retorna apenas os valores
		System.out.println(usuarios.entrySet()); // retorna chaves e valores
		
		System.out.println(usuarios.containsKey(20)); //retorna true e false
		System.out.println(usuarios.containsValue("Rebeca")); //retorna true e false
		
		System.out.println(usuarios.get(4));// retorna o valor da chave informada
		System.out.println(usuarios.remove(1));// remove o registro referente a chave informada
		System.out.println(usuarios.remove(4, "Gui"));// retorna false pois não achou o registro
		
		
		//percorrendo o mapa pela chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorrendo o mapa pelo valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//percorrendo o mapa pela chave e valor
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
		
		
		
		
		
		
		
	}

}
