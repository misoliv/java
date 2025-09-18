package atividadeestruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();
        int opcao;

        do {
        	System.out.println("\n********************************************" );
            System.out.println("\n================ Menu Banco ================" );
            System.out.println("    1 - Adicionar Cliente na fila"              );
            System.out.println("    2 - Listar todos os Clientes na fila"       );
            System.out.println("    3 - Chamar (retirar) um Cliente da fila"    );
            System.out.println("    0 - Sair"                                   );
            System.out.println("\n********************************************" );
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("\nFila: ");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nCliente Adicionado!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        String clienteChamado = fila.poll(); // remove o primeiro da fila
                        System.out.println("\nFila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente " + clienteChamado + " foi Chamado!");
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
