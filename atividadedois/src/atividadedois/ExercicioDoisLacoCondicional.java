package atividadedois;

import java.util.Scanner;

public class ExercicioDoisLacoCondicional {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
        
		// Declarar vari�veis 
		
        int numero;
        String parImpar, posNeg;

        System.out.print("Digite um n�mero: ");
        numero = leia.nextInt();

        // Verifica se � par ou �mpar
        if (numero % 2 == 0) {
            parImpar = "par";
        } else {
            parImpar = "�mpar";
        }

        // Verifica se � positivo ou negativo
        if (numero >= 0) {
            posNeg = "positivo";
        } else {
            posNeg = "negativo";
        }

        System.out.println("\nO N�mero " + numero + " � " + parImpar + " e " + posNeg + "!");

        leia.close();

	}

}
