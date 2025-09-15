package atividadedois;

import java.util.Scanner;

public class ExercicioQuatroLacoSwitch {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float saldo = 1000.00f; // Saldo inicial
        int operacao;
        float valor;

        System.out.println("=== Menu de Operações ===");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.print("\nOperação: ");
        operacao = leia.nextInt();

        switch (operacao) {
            case 1: // Saldo
                System.out.printf("\nOperação - Saldo\nSaldo: R$ %.2f\n", saldo);
                break;

            case 2: // Saque
                System.out.print("\nValor: R$ ");
                valor = leia.nextFloat();
                
                if (valor <= saldo) {
                    saldo -= valor;
                    System.out.printf("\nOperação - Saque\n\nNovo Saldo: R$ %.2f\n", saldo);
                } else {
                    System.out.println("\nOperação - Saque\n\nSaldo insuficiente!");
                }
                break;

            case 3: // Depósito
                System.out.print("\nValor: R$ ");
                valor = leia.nextFloat();
                
                saldo += valor;
                System.out.printf("\nOperação - Depósito\n\nNovo Saldo: R$ %.2f\n", saldo);
                break;

            default:
            	System.out.print("\nValor: R$ ");
                valor = leia.nextFloat();
                System.out.println("\nOperação Inválida!");
                break;
        }
        
        leia.close();
    }
}
