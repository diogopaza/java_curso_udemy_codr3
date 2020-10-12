import javax.swing.JOptionPane;

public class Exercicio2_9 {
	
	public static void main(String[] args) {
		
		int cont = 0;
		int maiorNumero = 0;
		while(cont <10) {
			int num =  Integer.parseInt(JOptionPane.showInputDialog
					("Digite um número"));
			if(num>maiorNumero) {
				maiorNumero = num;
			}		
			cont++;
		}
		JOptionPane.showMessageDialog(null, "O maior número é " + maiorNumero);
		
	}
	
}
