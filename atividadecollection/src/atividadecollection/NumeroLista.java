package atividadecollection;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroLista {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
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
        
              
        // Solicita n�mero ao usu�rio
        System.out.print("Digite o n�mero que voc� deseja encontrar: ");
        int busca = leia.nextInt();
        
        // Procura o n�mero no ArrayList
        if(numeros.contains(busca)) {
            int posicao = numeros.indexOf(busca);
            System.out.println("\nLista|2|5|1|3|4|9|7|8|10|6|");
            System.out.println("\nO n�mero " + busca + " est� localizado na posi��o: " + posicao);
        } else {
            System.out.println("\nO n�mero " + busca + " n�o foi encontrado!");
        }
        
        leia.close();
    }
}
