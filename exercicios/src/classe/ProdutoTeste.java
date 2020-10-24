package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 4359.89;
		p1.desconto = 0.25;
		var p2 = new Produto("Caneta preta");
		//p2.nome = ;
		p2.preco = 12;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		/*
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		*/
		double precoFinal1 = p1.precoComDesconto();
		
		System.out.printf("Valor final do %s é de %.2f ", p1.nome,precoFinal1);
		
		
		
		
		
		
	}
}
