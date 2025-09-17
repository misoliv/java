package atividadevetores;

import java.util.Scanner;

public class VetorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = new int[10];
        
        System.out.println("Vetor|2|5|1|3|4|9|7|8|10|6|");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            vetor[i] = leia.nextInt();
        }

        // Elementos nos índices ímpares
        System.out.print("\nElementos nos índices ímpares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) { // índice ímpar
                System.out.print(vetor[i] + " ");
            }
        }

        // Elementos pares do vetor
        System.out.print("\n\nElementos pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { // número par
                System.out.print(vetor[i] + " ");
            }
        }

        // Soma de todos os elementos
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("\n\nSoma: " + soma);

        // Média de todos os elementos
        double media = (double) soma / vetor.length;
        System.out.printf("\nMédia: %.2f\n", media);

        leia.close();
    }
}

