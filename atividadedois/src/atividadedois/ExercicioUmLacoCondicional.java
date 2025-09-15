package atividadedois;

import java.util.Scanner;

public class ExercicioUmLacoCondicional {

	public static void main(String[] args) {
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Digite o n�mero A: ");
        int A = leia.nextInt();

        System.out.print("Digite o n�mero B: ");
        int B = leia.nextInt();

        System.out.print("Digite o n�mero C: ");
        int C = leia.nextInt();
        
        // Opera��o: soma de A + B
        int soma = A + B;

        // Estrutura condicional if
        if (soma > C) {
        	System.out.println(B + " + " + A + " = " + soma + " > " + C);
            System.out.println("A soma de A + B � Maior do que C.");
        } else if (soma < C) {
        	System.out.println(A + " + " + B + " = " + soma + " < " + C);
        	System.out.println("A soma de A + B � Menor do que C.");
        } else {
        	System.out.println(A + " + " + B + " = " + soma + " = " + C);
        	System.out.println("A soma de A + B � Igual a C.");
        }
        
        leia.close();
	}

}
