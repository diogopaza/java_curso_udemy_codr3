package fundamentos;

import java.util.Date;
import java.util.Scanner;

public class Import {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		String s = "BOA TARDE";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		int a =3;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome ");
		String nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome ");
		String sobrenome = entrada.nextLine();
		System.out.printf("\nNome %s %s", nome, sobrenome );
		entrada.close();
		
	}
	

}
