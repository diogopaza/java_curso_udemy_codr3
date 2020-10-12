
public class BreakContinue {
	
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim");*/
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("to com continue");
				if(i == 1) {
					break;
				}
				System.out.printf("%d %d \n ", i, j);
			}
		}
		
		System.out.println("Fim");
		
	
	}
		
}
