package atividadeum;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as variáveis
		
		float salario, abono;
				
		//Entrada de dados
		
		System.out.printf("Salário: ");
		salario = leia.nextFloat();
		
		System.out.printf("Abono: ");
		abono = leia.nextFloat();
		
		// Efetuar os cálculos
		float novoSalario = salario + abono;
		System.out.printf("Novo Salário: %.2f%n", novoSalario);
		
		leia.close();

	}

}
