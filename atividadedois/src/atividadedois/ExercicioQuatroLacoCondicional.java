package atividadedois;

import java.util.Scanner;

public class ExercicioQuatroLacoCondicional {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
        
        String palavra1, palavra2, palavra3;
        String animal = "";

        System.out.println("Digite a 1� palavra: ");
        palavra1 = leia.nextLine();

        System.out.println("Digite a 2� palavra: ");
        palavra2 = leia.nextLine();

        System.out.println("Digite a 3� palavra: ");
        palavra3 = leia.nextLine();
        
        // As 3 condi��es verificadas de uma vez para cada animal
        if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carn�voro")) {
            animal = "�guia";
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("on�voro")) {
            animal = "Pomba";
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mam�fero") && palavra3.equalsIgnoreCase("on�voro")) {
            animal = "Homem";
        } else if (palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mam�fero") && palavra3.equalsIgnoreCase("herb�voro")) {
            animal = "Vaca";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hemat�fago")) {
            animal = "Pulga";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herb�voro")) {
            animal = "Lagarta";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anel�deo") && palavra3.equalsIgnoreCase("hemat�fago")) {
            animal = "Sanguessuga";
        } else if (palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("anel�deo") && palavra3.equalsIgnoreCase("on�voro")) {
            animal = "Minhoca";
        }

        // Sa�da 
             
        if (!animal.isEmpty()) {
        	System.out.println("\n========== Sa�da ==========");
            System.out.println("Animal: " + animal);
        } else {
            System.out.println("Animal n�o identificado. Combina��o inv�lida!");
        }
        
        leia.close();
	}
}


