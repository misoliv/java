package atividadevetores;

import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        System.out.println("Vetor|2|5|1|3|4|9|7|8|10|6|");

        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numero = leia.nextInt();

        boolean encontrado = false;
        
        // Laço de repetição para percorrer o vetor
        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] == numero) {
                System.out.println("\nO número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break; 
            }
        }

        // Se não foi encontrado
        if (!encontrado) {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        leia.close();
    }
}