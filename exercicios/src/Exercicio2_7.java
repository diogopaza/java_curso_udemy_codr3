import java.util.Scanner;

public class Exercicio2_7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vá digitando para ver a soma");
		int numero = 0;
		int contador = 0;
		while (numero >= 0) {

			System.out.println("Digite um número para somar");
			numero = entrada.nextInt();
			if(numero>0) {
				contador += numero;
				System.out.println("A soma é: " + contador);
			}
			
		}
		System.out.println("Fim");

	}

}
