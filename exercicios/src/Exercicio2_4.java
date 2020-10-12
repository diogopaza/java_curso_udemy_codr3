import java.util.Scanner;

public class Exercicio2_4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para saber se é primo ou nao");
		String numero = entrada.next();
		int tamanhoNumero =  numero.length() ;
		boolean numeroPrimo = true;
		Double numeroDouble = Double.parseDouble(numero);
		char result5 = '5';
		char result0 = '0'; 
		if(numeroDouble == 2) {
			System.out.println("Número é primo e é 2");
			numeroPrimo = true;
			
		}else {
			if(numeroDouble % 2 == 0) {
				System.out.println("Não é um número primo e e par");
				numeroPrimo = false;
			}
			else if(numero.charAt(tamanhoNumero -1) ==  result5 ||
					numero.charAt(tamanhoNumero -1) == result0) {
				System.out.println("Não é numero primo regra do 5 ou 0 no final");
				numeroPrimo = false;
			}
			
		}
		
		System.out.println(numeroPrimo);
	}
	
	
}
