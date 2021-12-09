package oo.encapsulamento.casaA;

public class Paulo {
		
	void testeAcessos() {
		
		Ana esposa = new Ana();
		
		// System.out.println(esposa.segredo); método privado, sem acesso
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDefalar);
		System.out.println(esposa.todosSabem);
	}
}
