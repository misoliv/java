package farmacia;

import java.util.Scanner;
import farmacia.model.Produto;
import farmacia.util.CoresFarmacia;

public class MenuFarmacia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		// Instanciar Objetos da Classe Conta

		Produto p1 = new Produto(1, "Sabonete Dove", 3.50f, 1 , 100);
		Produto p2 = new Produto(2, "Creatina", 70.00f, 2, 50);
		Produto p3 = new Produto(3, "Gaze", 5.00f, 3, 200);

		p1.visualizar();
		p2.visualizar();
		p3.visualizar();
     
        p1.setQuantidade(100);
        p2.setQuantidade(50);
        p2.setQuantidade(200);
        
 
		
		while (true) {
			
			System.out.println(CoresFarmacia.TEXT_CYAN + CoresFarmacia.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("          Farmacia do Campo                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("      1 - Cadastrar Produto                          ");
			System.out.println("      2 - Listar todos os produtos                   ");
			System.out.println("      3 - Buscar por ID Produto                      ");
			System.out.println("      4 - Atualizar Dados do Produto                 ");
			System.out.println("      5 - Apagar Produto                             ");
			System.out.println("      0 - Sair                                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                 " + CoresFarmacia.TEXT_RESET);
			
			opcao = leia.nextInt();
		
		if (opcao == 0) {
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "\nFarmácia do Campo");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "Cadastrar Produto \n\n");
			
			break;
		case 2:
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "Listar todos os Produtos \n\n");
			
			break;
		case 3:
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "Buscar por ID Produto\n\n");
			
			break;	
		case 4:
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "Atualizar dados do Produto \n\n");
			
			break;
		case 5:
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "Apagar Produto\n\n");
			
			break;
		case 6:
			System.out.println(CoresFarmacia.TEXT_WHITE_BOLD + "Sair\n\n");
			
			break;	
		default:
			System.out.println(CoresFarmacia.TEXT_RED_BOLD + "\nOpção Inválida!\n");
			break;	
			
		}
		
	}
		
}

	public static void sobre() {
		System.out.println("\n*************************************");
		System.out.println("Projeto desenvolvido por Milena Svitras");
		System.out.println("Milena Svitras - milenasvitras@gmail.com");
		System.out.println("github.com/misoliv");
		System.out.println("***************************************");
	}

}