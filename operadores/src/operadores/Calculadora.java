package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
				
		//Definir as variáveis
				
		double numero1, numero2;
				
		// Entrada de dados
				
		System.out.println("Digite o primeiro número ");
		numero1 = leia.nextDouble();
				
		System.out.println("Digite o segundo número ");
		numero2 = leia.nextDouble();
		
		// Efetuar os cálculos
				
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
		
		// Operações matemáticas com a Classe Math
		
		System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));
				
		leia.close();
	}

}
