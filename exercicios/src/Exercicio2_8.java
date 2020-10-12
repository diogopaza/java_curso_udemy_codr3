import java.util.Scanner;

public class Exercicio2_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = entrada.next();
		for(int i=0;i<palavra.length();i++){
			System.out.println(palavra.charAt(i));
		}
	}

}
