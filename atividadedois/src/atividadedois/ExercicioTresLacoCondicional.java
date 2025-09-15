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

        System.out.print("Primeira doa��o de sangue? (true/false): ");
        boolean primeiraDoacao = leia.nextBoolean();

        // Verifica��o das regras
        boolean apto = false;

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69 && primeiraDoacao) {
                apto = false; 
            } else {
                apto = true;
            }
        }

        // Sa�da
        if (apto) {
            System.out.println(nome + " est� apto(a) para doar sangue!");
        } else {
            System.out.println(nome + " n�o est� apto(a) para doar sangue!");
        }

        leia.close();
    }
}

