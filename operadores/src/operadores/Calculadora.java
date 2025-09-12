package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
				
		//Definir as vari�veis
				
		double numero1, numero2;
				
		// Entrada de dados
				
		System.out.println("Digite o primeiro n�mero ");
		numero1 = leia.nextDouble();
				
		System.out.println("Digite o segundo n�mero ");
		numero2 = leia.nextDouble();
		
		// Efetuar os c�lculos
				
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
		
		// Opera��es matem�ticas com a Classe Math
		
		System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));
				
		leia.close();
	}

}
