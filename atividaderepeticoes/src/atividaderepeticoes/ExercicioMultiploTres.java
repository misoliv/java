package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioMultiploTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) { 
                soma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }

        leia.close();
    }
}

