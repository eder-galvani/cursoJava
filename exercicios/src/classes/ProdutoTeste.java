package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4200.00;
		//p1.desconto = 0.25;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 15.00;
		Produto.desconto = 0.10; //alterando o valor default do desconto
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	
	}
}
