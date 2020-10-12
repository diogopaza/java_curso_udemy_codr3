package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		double temperaturaEntradaF = 86;
		double temperaturaC = 0;
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5.0 / 9.0;	

		temperaturaC = (temperaturaEntradaF - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura " + temperaturaEntradaF + " em graus fahrenheit é igual a " + temperaturaC
				+ " em graus Celsius");

	}
}
