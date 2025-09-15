package atividadedois;

import java.util.Scanner;

public class ExercicioTresLacoCondicional {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o Nome do doador: ");
        String nome = leia.nextLine();

        System.out.print("Digite a Idade do doador: ");
        int idade = leia.nextInt();

        System.out.print("Primeira doação de sangue? (true/false): ");
        boolean primeiraDoacao = leia.nextBoolean();

        // Verificação das regras
        boolean apto = false;

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69 && primeiraDoacao) {
                apto = false; 
            } else {
                apto = true;
            }
        }

        // Saída
        if (apto) {
            System.out.println(nome + " está apto(a) para doar sangue!");
        } else {
            System.out.println(nome + " não está apto(a) para doar sangue!");
        }

        leia.close();
    }
}

