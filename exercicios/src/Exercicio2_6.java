import java.util.Random;
import java.util.Scanner;

public class Exercicio2_6 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner entrada = new Scanner(System.in);
		int numeroAleatorio = gerador.nextInt(100);
		System.out.println(numeroAleatorio);
		System.out.println("Adivinhe o número gerado");
		System.out.println("Digite um número de 0 até 100 ou s para sair");
		String valorDigitado = entrada.next();
		if (valorDigitado.equals("s")) {
			System.out.println("Fim do jogo");
		}
		else if (Double.parseDouble(valorDigitado) == numeroAleatorio) {
			System.out.println("Parabéns você acertou de primeira");
		} else {
			while (Double.parseDouble(valorDigitado) != numeroAleatorio) {
				System.out.println("Digite um número de 0 até 100 ou s para sair");
				valorDigitado = entrada.next();
				if (valorDigitado.equals("s")) {
					System.out.println("Fim do jogo");
					break;
				}
			}
		}
		if (!valorDigitado.equals("s"))
			System.out.println("Parabéns você acertou");

	}
}
