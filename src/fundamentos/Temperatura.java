package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		
		final double ajuste = 32;
		final double fator = 5/9.0;
		double faren = 15;
		double celcius = (faren - ajuste) * fator;
		
		System.out.println("o resultado e" + celcius);
		
	}

}
