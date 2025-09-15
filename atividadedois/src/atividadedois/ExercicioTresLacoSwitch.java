package atividadedois;

import java.util.Scanner;

public class ExercicioTresLacoSwitch {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o 1º número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = leia.nextFloat();

        System.out.print("Operação: ");
        int operacao = leia.nextInt();

        float resultado = 0.0f;
        String simbolo = "";

        // Laço condicional switch
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                simbolo = "+";
                break;
            case 2:
                resultado = numero1 - numero2;
                simbolo = "-";
                break;
            case 3:
                resultado = numero1 * numero2;
                simbolo = "*";
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    simbolo = "/";
                } else {
                    System.out.println("Erro: divisão por zero!");
                    leia.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        // Saída 
        System.out.println("\n========== Saída ==========");
        System.out.printf("%.1f %s %.1f = %.1f%n", numero1, simbolo, numero2, resultado);

        leia.close();
    }
}

