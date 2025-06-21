package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media  >= 7.0)  {
			  System.out.println("Aprovado");
			  System.out.println("Parabéns");
		}

		if (media >= 4.0 &&  media <= 6.9)  {
			  System.out.println("Recuperação");
			  System.out.println("Estude");
		}

		if (media >= 0 && media <= 3.9)  {
			  System.out.println("Reprovado");
			  System.out.println("Sinto muito!");
		}

		entrada.close();     
 
	} 

}
