package atividadeum;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as variáveis
		
		float n1, n2, n3, n4, diferenca;
		
		// Leia os valores
		
		System.out.printf("numero1: ");
		n1 = leia.nextFloat();
		
		System.out.printf("numero2: ");
		n2 = leia.nextFloat();
		
		System.out.printf("numero3: ");
		n3 = leia.nextFloat();
		
		System.out.printf("numero4: ");
		n4 = leia.nextFloat();
		
		//Calcular a diferença dos produtos
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		//Resultado
		
		System.out.printf("Diferença: %.2f%n", diferenca);
	
		leia.close();

	}

}
