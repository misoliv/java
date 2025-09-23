package farmacia.model;

public class Produto {
    
    //Atributos da classe
    private int id;
    private String produto;
    private float preco;
    private int categoria;
    private int quantidade;

    //Construtor
    public Produto(int id, String produto, float preco, int categoria, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.preco = preco;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    //Getters e Setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public boolean total(int quantidadeRetirada) {
        if (this.quantidade < quantidadeRetirada) {
            System.out.println("\nQuantidade Insuficiente!");
            return false;
        }

        this.quantidade -= quantidadeRetirada;
        return true;
    }

	public void visualizar() {

	String categoria = "";

	switch (this.categoria) {
		case 1 -> categoria = "Higiene";
		case 2 -> categoria = "Suplementos";
		case 3 -> categoria = "Primeiros Socorros";
		default -> categoria = "Desconhecido";
	}

        System.out.println("----------------------------------------");
        System.out.printf("ID: %d%n", this.id);
        System.out.printf("Produto: %s%n", this.produto);
        System.out.printf("Preço: R$ %.2f%n", this.preco);
        System.out.printf("Categoria: %s%n", categoria);
        System.out.printf("Quantidade em estoque: %d%n", this.quantidade);
        System.out.println("----------------------------------------");
    }
}
