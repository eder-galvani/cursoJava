package classes;

public class Data {

	int dia;
	int mes;
	int ano ;
	
	String ObterDataFormatada() {
		String dataFormatada = dia + "/"+ mes + "/" + ano;
		return dataFormatada;
		
		/*resposta do professor
		return String.format("%d%d%d", dia, mes, ano);
		*/
	}
}
