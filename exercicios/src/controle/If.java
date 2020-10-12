package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		//Domingo -> 1 
		//Quarta -> 4 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana");
		String dia = entrada.next();
		
		if(dia.toLowerCase().equals("domingo")) {
			System.out.println(dia +" é o dia 1 da semana");
		}
		else if(dia.toLowerCase().equals("segunda")) {
			System.out.println(dia +" é o dia 2 da semana");
		}
		else if(dia.toLowerCase().equals("terça")) {
			System.out.println(dia +" é o dia 3 da semana");
		}
		else if(dia.toLowerCase().equals("quarta")) {
			System.out.println(dia +" é o dia 4 da semana");
		}
		else if(dia.toLowerCase().equals("quinta")) {
			System.out.println(dia +" é o dia 5 da semana");
		}
		else if(dia.toLowerCase().equals("sexta")) {
			System.out.println(dia +" é o dia 6 da semana");
		}
		else if(dia.toLowerCase().equals("sabado")) {
			System.out.println(dia +" é o dia 7 da semana");
		}
		else {
			System.out.println("Dia inválido");
		}
		
	}
	
}
