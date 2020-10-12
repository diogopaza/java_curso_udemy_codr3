import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * //1
		 * 
		 * System.out.println("Digite um valor de 0 a 10"); int valor =
		 * entrada.nextInt(); if(valor>=0 & valor<=10) { if(valor%2 == 0) {
		 * System.out.println("É par"); } }else { System.out.println("Valor inválido");
		 * }
		 */

		// 2

		System.out.println("Digite o ano para saber se é bissexto ou não");
		int ano = entrada.nextInt();
		boolean bissexto = true;
		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
				} else {
					bissexto = false;
					System.out.println("Não é bissexto");
				}
			}
			if(bissexto) {
				System.out.println("É bissexto");
			}
			
		} else {
			System.out.println("Não é bissexto");
		}

	}

}
