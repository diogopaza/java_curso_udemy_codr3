package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4359.89);
		var p2 = new Produto("Caneta preta", 10);
		
				
		System.out.printf("Valor final do %s é de %.2f ", p2.nome, p2.precoComDesconto);
		System.out.printf("Valor final do %s é de %.2f ", p1.nome, p1.precoComDesconto);
		
		
		
		
		
	}
}
