package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double demB = 2;
		
	   double superiorA = numA / denA;
	   double superiorB = Math.pow(numB /demB, 2);
	   
	   double superior = Math.pow(superiorA - superiorB, 3);
	   double inferior = Math.pow(10, 3);
	   

	   double resultado = superior / inferior;
	   
	   System.out.println("O resultado é:" + resultado);
	   
	}
}
