package atividadevetores;

import java.util.Scanner;

public class VetorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = new int[10];
        
        System.out.println("Vetor|2|5|1|3|4|9|7|8|10|6|");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o n�mero para a posi��o " + i + ": ");
            vetor[i] = leia.nextInt();
        }

        // Elementos nos �ndices �mpares
        System.out.print("\nElementos nos �ndices �mpares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) { // �ndice �mpar
                System.out.print(vetor[i] + " ");
            }
        }

        // Elementos pares do vetor
        System.out.print("\n\nElementos pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { // n�mero par
                System.out.print(vetor[i] + " ");
            }
        }

        // Soma de todos os elementos
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("\n\nSoma: " + soma);

        // M�dia de todos os elementos
        double media = (double) soma / vetor.length;
        System.out.printf("\nM�dia: %.2f\n", media);

        leia.close();
    }
}

