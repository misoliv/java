package atividadeum;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as vari�veis
		
		float salario, abono;
				
		//Entrada de dados
		
		System.out.printf("Sal�rio: ");
		salario = leia.nextFloat();
		
		System.out.printf("Abono: ");
		abono = leia.nextFloat();
		
		// Efetuar os c�lculos
		float novoSalario = salario + abono;
		System.out.printf("Novo Sal�rio: %.2f%n", novoSalario);
		
		leia.close();

	}

}
