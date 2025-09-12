package atividadeum;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as variáveis
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		//Entrada de dados
		
		System.out.printf("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.printf("Descontos: ");
		descontos = leia.nextFloat();
		
		// Cálculo do salário líquido
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		//Exibir resultado
		
		System.out.printf("Salário Líquido = %.2f%n", salarioLiquido);
		
		leia.close();

	}

}
