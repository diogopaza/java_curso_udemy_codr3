package classe;

public class Produto {

	String nome;
	double preco;
	double precoComDesconto;
	static double desconto = 0.25;

	Produto(String nomeInicial,double preco) {
		this.nome = nomeInicial;
		this.precoComDesconto = preco * (1 - desconto);   
	}

	Produto() {
	}
	

	double precoComDesconto() {

		return preco * (1 - desconto);
	}

}
