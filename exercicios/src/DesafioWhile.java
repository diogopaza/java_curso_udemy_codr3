import java.util.Scanner;

public class DesafioWhile {
	
	//media notas de uma turma
			// nao sei quantos alunos tem a turma
			//nota 0 a 10 - 
			//quantas notas validas foram digitadas
			// para sair - usuario digita -1


	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		String dados = null;
		int notasValidas = 0;
		double nota = 0;
		double media=0;
		double contador=0;
		
		System.out.println("Média da turma");
		do {
			System.out.println("Digite a nota do aluno ou -1 para sair");
			dados = entrada.next();
			if(!dados.equals("-1")) {
				nota = Double.parseDouble(dados);
				if( (nota>0) & (nota <= 10) ) {
					notasValidas ++;
					contador = contador + nota;
					
				}else {
					System.out.println("Nota inválida");
				}
				
			}			
		}while(!dados.equalsIgnoreCase("-1"));
		
		if(contador>0) {
			media = contador / notasValidas;
		}
		
		
		System.out.printf("Total de notas válidas é de %d", notasValidas);
		
		System.out.printf("\nA média da turma é %.2f ", media);
		
	}
}		
			
		
		
		
			
		
			
		
			
		
	
	

