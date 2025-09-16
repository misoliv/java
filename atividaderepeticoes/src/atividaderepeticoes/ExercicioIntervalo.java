package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioIntervalo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro n�mero do intervalo: ");
        int primeiro = leia.nextInt();

        System.out.print("Digite o �ltimo n�mero do intervalo: ");
        int ultimo = leia.nextInt();

        // Verifica��o do intervalo
        if (primeiro >= ultimo) {
            System.out.println("Intervalo inv�lido!");
        } else {
            System.out.println("No Intervalo entre " + primeiro + " e " + ultimo + ":");

            // La�o for para percorrer o intervalo
            for (int contador = primeiro; contador <= ultimo; contador++) {
                if (contador % 3 == 0 && contador % 5 == 0) {
                    System.out.println(contador + " � m�ltiplo de 3 e 5");
                }
            }
        }

        leia.close();
    }
}

