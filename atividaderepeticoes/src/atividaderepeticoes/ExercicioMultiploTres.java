package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioMultiploTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um n�mero: ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) { 
                soma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A m�dia de todos os n�meros m�ltiplos de 3 �: " + media);
        } else {
            System.out.println("Nenhum n�mero m�ltiplo de 3 foi digitado.");
        }

        leia.close();
    }
}

