package atividadeum;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as vari�veis
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		//Entrada de dados
		
		System.out.printf("Sal�rio Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.printf("Descontos: ");
		descontos = leia.nextFloat();
		
		// C�lculo do sal�rio l�quido
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		//Exibir resultado
		
		System.out.printf("Sal�rio L�quido = %.2f%n", salarioLiquido);
		
		leia.close();

	}

}
