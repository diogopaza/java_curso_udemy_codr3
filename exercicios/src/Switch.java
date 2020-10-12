import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		
		String conceito = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: 
			conceito = "A";
			break;
		case 9:
			conceito = "A";
			break;
		case 8:
			conceito = "B";
			break;
		case 7:
			conceito = "B";
			break;
		case 6:
			conceito = "C";
			break;
		case 5:
			conceito = "C";
			break;
		case 4:
			conceito = "C";
			break;
		default: 
			conceito = "não informado";
		}
		
		System.out.println("O conceito é " + conceito);
	}
	
	
	
	
}
