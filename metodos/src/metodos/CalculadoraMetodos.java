package metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double numero1, numero2;
				
		System.out.println("Digite o primeiro n�mero ");
		numero1 = leia.nextDouble();
				
		System.out.println("Digite o segundo n�mero ");
		numero2 = leia.nextDouble();
		
		
		
		leia.close();
	}

}
