package atividadedois;

import java.util.Scanner;

public class ExercicioDoisLacoSwitch{
	    public static void main(String[] args) {
	        
	    	Scanner leia = new Scanner(System.in);

	        // Entrada de dados
	        System.out.println("\n--- Entrada ---");
	        System.out.print("\n Nome do Colaborador: ");
	        String nome = leia.nextLine();

	        System.out.print("\n Cargo: ");
	        int codigoCargo = leia.nextInt();

	        System.out.print("\n Sal�rio: R$ ");
	        float salario = leia.nextFloat();

	        String cargo = "";
	        float percentual = 0.0f;

	        // Cargo e reajuste
	        switch (codigoCargo) {
	        
	        case 1:
	             cargo = "Gerente";
	             percentual = 0.10f;
	             break;
	        case 2:
	             cargo = "Vendedor";
	             percentual = 0.07f;
	             break;
	        case 3:
	             cargo = "Supervisor";
	             percentual = 0.09f;
	             break;
	        case 4:
	             cargo = "Motorista";
	             percentual = 0.06f;
	             break;
	        case 5:
	             cargo = "Estoquista";
	             percentual = 0.05f;
	             break;
	        case 6:
	             cargo = "T�cnico de TI";
	             percentual = 0.08f;
	             break;
	        default:
	        System.out.println("C�digo de cargo inv�lido!");
	                leia.close();
	                return;
	        }

	        // C�lculo do novo sal�rio
	        float novoSalario = salario + (salario * percentual);

	        // Sa�da 
	        System.out.println("\n--- Sa�da ---");
	        System.out.println("\n Nome do Colaborador: " + nome);
	        System.out.println("\n Cargo: " + cargo);
	        System.out.printf("\n Sal�rio: R$ %.2f%n", novoSalario);

	        leia.close();
	    }
	}

