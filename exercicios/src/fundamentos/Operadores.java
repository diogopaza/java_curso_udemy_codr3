package fundamentos;

import java.util.Scanner;

public class Operadores {
	
	public static void main(String[] args) {
		
		//desafio monta a expressao
		
		Scanner entrada = new Scanner(System.in);
		double formula1 = Math.pow(6*(3+2), 2)/6;
		double formula2 = Math.pow( (1-5)*(2-7)/2, 2);
		double formulaFinal = Math.pow(formula1 - formula2, 3 ) / Math.pow(10, 3);
		System.out.println(formulaFinal);
	}
}
