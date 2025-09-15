package atividadedois;

import java.util.Scanner;

public class ExercicioUmLacoCondicional {

	public static void main(String[] args) {
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Digite o número A: ");
        int A = leia.nextInt();

        System.out.print("Digite o número B: ");
        int B = leia.nextInt();

        System.out.print("Digite o número C: ");
        int C = leia.nextInt();
        
        // Operação: soma de A + B
        int soma = A + B;

        // Estrutura condicional if
        if (soma > C) {
        	System.out.println(B + " + " + A + " = " + soma + " > " + C);
            System.out.println("A soma de A + B é Maior do que C.");
        } else if (soma < C) {
        	System.out.println(A + " + " + B + " = " + soma + " < " + C);
        	System.out.println("A soma de A + B é Menor do que C.");
        } else {
        	System.out.println(A + " + " + B + " = " + soma + " = " + C);
        	System.out.println("A soma de A + B é Igual a C.");
        }
        
        leia.close();
	}

}
