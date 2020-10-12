package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	//ler num1
	//ler num2
	//qual é a operação + - * /
	//fazer a operação
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo valor");
		double num2 = entrada.nextDouble();
		System.out.println("Digite a operação");
		String operacao = entrada.next();
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1- num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		System.out.println("resultado " + resultado);
		System.out.printf( "%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		entrada.close();
		
	}
	
	
	
}
