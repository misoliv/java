package atividadecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cores {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();
        
        // Entrada de dados: ler as cores
        System.out.println("Digite 5 cores:");
        for(int i = 0; i < 5; i++) {
            System.out.print((i+1) + "ª cor: ");
            String cor = leia.nextLine();
            cores.add(cor);
        }
        
        // Mostrar todas as cores
        System.out.println("\nListar todas as cores:");
        for(String cor : cores) {
            System.out.println(cor);
        }
        
        // Ordenar em ordem crescente
        Collections.sort(cores);
        
        System.out.println("\nOrdenar as cores:");
        for(String cor : cores) {
            System.out.println(cor);
        }
        
        leia.close();
    }
}
