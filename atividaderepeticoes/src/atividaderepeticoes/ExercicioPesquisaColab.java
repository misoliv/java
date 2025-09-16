package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioPesquisaColab {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);

        int backendCount = 0;
        int frontendMulheresCisTransCount = 0;
        int mobileHomensCisTransMaior40 = 0;
        int fullstackNaoBinarioMenor30 = 0;
        int totalPessoas = 0;
        int somaIdades = 0;

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
           
            System.out.print("Idade: ");
            int idade = leia.nextInt();

            System.out.print("Identidade de G�nero (1-Mulher Cis, 2-Homem Cis, 3-N�o Bin�rio, 4-Mulher Trans, 5-Homem Trans, 6-Outros): ");
            int genero = leia.nextInt();

            System.out.print("Pessoa Desenvolvedora (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
            int desenvolvedor = leia.nextInt();

            totalPessoas++;
            somaIdades += idade;

           
            if (desenvolvedor == 1) { // Backend
                backendCount++;
            }

            if (desenvolvedor == 2 && (genero == 1 || genero == 4)) { // Frontend + Mulheres Cis ou Trans
                frontendMulheresCisTransCount++;
            }

            if (desenvolvedor == 3 && (genero == 2 || genero == 5) && idade > 40) { // Mobile + Homens Cis/Trans + >40
                mobileHomensCisTransMaior40++;
            }

            if (desenvolvedor == 4 && genero == 3 && idade < 30) { // FullStack + N�o Bin�rio + <30
                fullstackNaoBinarioMenor30++;
            }

            System.out.print("\nDeseja continuar (S/N): ");
            leia.nextLine(); 
            continuar = leia.nextLine();
            System.out.println();
        }

        // C�lculo da m�dia
        double mediaIdade = (totalPessoas > 0) ? (double) somaIdades / totalPessoas : 0.0;

        // Sa�da 
        System.out.println("Total de pessoas desenvolvedoras Backend: " + backendCount);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + frontendMulheresCisTransCount);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobileHomensCisTransMaior40);
        System.out.println("Total de Pessoas N�o Bin�rias desenvolvedoras FullStack menores de 30 anos: " + fullstackNaoBinarioMenor30);
        System.out.println("O n�mero total de pessoas que responderam � pesquisa: " + totalPessoas);
        System.out.printf("A m�dia de idade das pessoas que responderam � pesquisa: %.2f\n", mediaIdade);

        leia.close();
    }
}
