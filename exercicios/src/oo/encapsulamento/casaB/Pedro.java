package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	Ana mae = new Ana();
	
	void testeAcessos() {
		// System.out.println(mae.segredo); // método privado
		// System.out.println(segredo); // método privado
		// System.out.println(mae.facoDentroDeCasa); // só pra quem é do mesmo pacote
		// System.out.println(facoDentroDeCasa); // só pra quem é do mesmo pacote
		System.out.println(formaDefalar); // não precisa ser pela instancia, pois recebeu por herança
		System.out.println(todosSabem); // não precisa ser pela instancia, pois recebeu por herança
		System.out.println(new Ana().todosSabem);
	}
}
