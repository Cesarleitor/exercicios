package fundamentos;



public class AreaCircunferencia {
	public static void main(String[] args) {
		
		double raio = 3.4;
		// Final quer dizer que esse valor não pode ser mudado
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		/* Essa e uma opção 
		System.out.println(pi * raio * raio);
		*/
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área =" + area + "M2");
	}

}
