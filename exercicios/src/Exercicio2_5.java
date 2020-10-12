import java.util.Scanner;

public class Exercicio2_5 {
	public static void main(String[] args) {
		/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para saber se é primo ou nao");
		String numero = entrada.next();
		int tamanhoNumero = numero.length();
		boolean numeroPrimo = true;
		Double numeroDouble = Double.parseDouble(numero);
		char result5 = '5';
		char result0 = '0';

		switch (numero) {
		case (Double.parseDouble(numero) == 2):
			System.out.println("Número é primo e é 2");
			numeroPrimo = true;
			break;
		}*/			
				int contadorDeDivisores = 0;
				Scanner scanner = new Scanner(System.in);

				System.out.println("\nDigite um numero para verificar se é primo:");
				int numero = scanner.nextInt();

				for (int i = 2; i < numero; i++) {
					if (numero % i == 0) {
						contadorDeDivisores++;
					}
				}

				switch (contadorDeDivisores) {

				case 0:
					System.out.println("O numero " + numero + " é um numero primo.");
					break;

				default:
					System.out.println("O numero " + numero + "  não é um numero primo.");

				}

				scanner.close();

			}
		

}
