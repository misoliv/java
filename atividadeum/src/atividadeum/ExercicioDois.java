package atividadeum;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		//Definir as variáveis
		
		float nota1, nota2, nota3, nota4, media;
		
		//Ler as notas
		System.out.printf("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.printf("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.printf("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.printf("Nota 4: ");
		nota4 = leia.nextFloat();
		
		//Calcular a média
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Exibir média final
		
		System.out.printf("Média final: %.1f%n", media);
		
		leia.close();

	}

}
