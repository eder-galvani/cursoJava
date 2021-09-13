package classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia (Objeto)

		d1.dia = 31; // ao alterar uma afeta a outra.
		d1.dia = 31;
		d2.mes = 12;

		System.out.println(d1.ObterDataFormatada());
		System.out.println(d2.ObterDataFormatada());

		voltarDataParaValorPadrao(d1); // ao chamar essa função passando um objeto como parametro, ela altera o objeto
										// d1 e d2

		System.out.println(d1.ObterDataFormatada());
		System.out.println(d2.ObterDataFormatada());

		int c = 5;
		alteraPrimitivo(c); // o valor da variábel não é alterado pois foi passado como valor (foi criada
							// uma cópia do valor e passado como paranetro)
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;

	}

	static void alteraPrimitivo(int c) {
		c++;
	}
}
