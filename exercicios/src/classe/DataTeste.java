package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data dt1 = new Data();
		dt1.dia = 28;
		dt1.mes = 8;
		dt1.ano = 1982;
		
		Data dt2 = new Data();
		dt2.dia = 24;
		dt2.mes = 3;
		dt2.ano = 1975;
		
		System.out.printf("Data 1 = %d/%d/%d", dt1.dia, dt1.mes, dt1.ano);
		System.out.println("\nData 2 = " + dt2.dia + "/" + dt2.mes + "/" + dt2.ano);
	}
}
