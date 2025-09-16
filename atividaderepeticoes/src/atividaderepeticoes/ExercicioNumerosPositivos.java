package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioNumerosPositivos {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int numero;
        int somaPositivos = 0;

        do {
            System.out.print("Digite um n�mero: ");
            numero = leia.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            }

        } while (numero != 0);

        System.out.println("A soma dos n�meros positivos �: " + somaPositivos);

        leia.close();
    }
}
