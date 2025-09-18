package atividadeestruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>();
        int opcao;

        do {
            System.out.println("\n********************************************");
            System.out.println("\n================ Menu Biblioteca ============");
            System.out.println("    1 - Adicionar Livro na Pilha");
            System.out.println("    2 - Listar todos os Livros");
            System.out.println("    3 - Retirar um Livro da Pilha");
            System.out.println("    0 - Sair");
            System.out.println("\n********************************************");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String livro = leia.nextLine();
                    pilha.push(livro); 
                    System.out.println("\nPilha: ");
                    for (String l : pilha) {
                        System.out.println(l);
                    }
                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha: ");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        pilha.pop(); 
                        System.out.println("\nPilha: ");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        leia.close();
    }
}
