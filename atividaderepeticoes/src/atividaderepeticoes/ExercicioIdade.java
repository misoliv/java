package atividaderepeticoes;

import java.util.Scanner;

public class ExercicioIdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;
        int menor21 = 0;
        int maior50 = 0;

        do {
            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();

            if (idade >= 0) { 
                if (idade < 21) {
                    menor21++;
                } else if (idade > 50) {
                    maior50++;
                }
            }

        } while (idade >= 0); 

        // Sa�da 
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

        leia.close();
    }
}


