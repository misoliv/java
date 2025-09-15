package atividadedois;

import java.util.Scanner;

public class ExercicioDoisLacoCondicional {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
        
		// Declarar variáveis 
		
        int numero;
        String parImpar, posNeg;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        // Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            parImpar = "par";
        } else {
            parImpar = "ímpar";
        }

        // Verifica se é positivo ou negativo
        if (numero >= 0) {
            posNeg = "positivo";
        } else {
            posNeg = "negativo";
        }

        System.out.println("\nO Número " + numero + " é " + parImpar + " e " + posNeg + "!");

        leia.close();

	}

}
