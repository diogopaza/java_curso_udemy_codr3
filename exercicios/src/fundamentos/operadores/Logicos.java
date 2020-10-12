package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		//terça(V ou F)
		//quinta(V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 & trabalho2;
		if( (trabalho1 == false) & (trabalho2 == false) ) {
			System.out.println("Sem dinheiro");
		}else {
			if(tv50) {
				System.out.println("Comprei tv50");
				System.out.println("Tomamos sorvete");
			}
			if(!tv50) {
				boolean tv32 = trabalho1 || trabalho2;
				System.out.println("Comprei TV 32");
				System.out.println("Tomamos sorvete");			
			}
		}	
		
		double media = 7;
		String resultado = media >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
		
	}
	
}
