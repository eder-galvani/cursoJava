package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		
		Ana sogra = new Ana();
		
		// System.out.println(sogra.segredo); //método privado, sem acesso
		// System.out.println(sogra.facoDentroDeCasa);
		// System.out.println(sogra.formaDefalar);
		System.out.println(sogra.todosSabem);
	}
}
