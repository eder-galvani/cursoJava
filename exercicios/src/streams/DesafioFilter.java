package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produtos p1 = new Produtos("Notebook", 2300.00, 0.30, true);
		Produtos p2 = new Produtos("Monitor", 900.00, 0.45, true);
		Produtos p3 = new Produtos("Cadeira", 850.00, 0.10, false);
		Produtos p4 = new Produtos("Teclado", 119.00, 0.35, false);
		Produtos p5 = new Produtos("Mouse", 56.00, 0.30, true);
		Produtos p6 = new Produtos("Câmera", 450.00, 0.15, false);
		
		List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

		Predicate<Produtos> promocao = p -> p.desconto >= 0.30;
		Predicate<Produtos> frete = p -> p.fretegratis;

		Function<Produtos, String> produtosDestaque = 
				p -> "O produto "
				+ p.nome
				+ " está em promoção, com frete grátis e "
				+ (p.desconto * 100) + "% de desconto!";
				
		produtos.stream()
		.filter(promocao)
		.filter(frete)
		.map(produtosDestaque)
		.forEach(System.out::println);
		
		
		
	}
}
