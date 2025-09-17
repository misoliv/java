package atividadevetores;

import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        System.out.println("Vetor|2|5|1|3|4|9|7|8|10|6|");

        System.out.print("\nDigite o n�mero que voc� deseja encontrar: ");
        int numero = leia.nextInt();

        boolean encontrado = false;
        
        // La�o de repeti��o para percorrer o vetor
        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] == numero) {
                System.out.println("\nO n�mero " + numero + " est� localizado na posi��o: " + i);
                encontrado = true;
                break; 
            }
        }

        // Se n�o foi encontrado
        if (!encontrado) {
            System.out.println("\nO n�mero " + numero + " n�o foi encontrado!");
        }

        leia.close();
    }
}