package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioParesImpares {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int pares = 0;
        int impares = 0;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.print("Digite o " + contador + "� n�mero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nTotal de n�meros pares: " + pares);
        System.out.println("Total de n�meros �mpares: " + impares);

        scanner.close();
    }
}

