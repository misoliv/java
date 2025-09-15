package atividadedois;

import java.util.Scanner;

public class ExercicioUmLacoSwitch {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Código do Produto: ");
        int codigo = leia.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = leia.nextInt();

        String produto = "";
        double preco = 0.0;

        // Laço condicional SWITCH
        switch (codigo) {
        
        case 1:
             produto = "Cachorro Quente";
             preco = 10.00;
             break;
        case 2:
             produto = "X-Salada";
             preco = 15.00;
             break;
        case 3:
             produto = "X-Bacon";
             preco = 18.00;
             break;
        case 4:
             produto = "Bauru";
             preco = 12.00;
             break;
        case 5:
             produto = "Refrigerante";
             preco = 8.00;
             break;
        case 6:
             produto = "Suco de Laranja";
             preco = 13.00;
             break;
        default:
        System.out.println("Opção inválida!");
        } 

        // Cálculo do valor total
        double valorTotal = quantidade * preco;

        // Saída 
        System.out.printf("Produto: %s%nValor total: R$ %.2f%n", produto, valorTotal);

        leia.close();
    }
}
