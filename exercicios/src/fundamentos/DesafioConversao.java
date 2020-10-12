package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro salário");
		String salario1 =  entrada.nextLine();
		String salario1Final = salario1.replace(",", ".");		
		System.out.println("Digite o segundo salário");
		String salario2 =  entrada.nextLine();
		String salario2Final = salario2.replace(",", ".");	
		System.out.println("Digite o terceiro salário");
		String salario3 =  entrada.nextLine();
		String salario3Final = salario3.replace(",", ".");	
		
		double mediaSalario = (Double.parseDouble(salario1Final)+Double.parseDouble(salario2Final)+Double.parseDouble(salario3Final))/3;
		System.out.println("A média é: " + mediaSalario);
		entrada.close();
		
	}
	
	
}
