package classes;

public class DataTeste {
	public static void main(String[] args) {
		Data dt1 = new Data();
		dt1.dia = 28;
		dt1.mes = 11;
		dt1.ano = 1982;
		
		var dt2 = new Data();
		dt2.dia = 24;
		dt2.mes = 4;
		dt2.ano = 1975;
		
		System.out.printf("Data 1 = " + dt1.ObterDataFormatada());
		System.out.println("\nData 2 = " + dt2.ObterDataFormatada());
		
	}
}
