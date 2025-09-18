package atividadecollection;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetWrapper {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new LinkedHashSet<Integer>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        // Exibindo os valores do Set na ordem que foram inseridos
        System.out.print("Lista: ");
        for (int valor : numeros) {
            System.out.print(valor + " ");
        }

        // Entrada de dados do usuário
        System.out.print("\n\nDigite o número que você deseja encontrar: ");
        int numero = leia.nextInt();

        // Verificação se o número está presente no Set
        if (numeros.contains(numero)) {
            System.out.println("\nO número " + numero + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        leia.close();
    }
}

