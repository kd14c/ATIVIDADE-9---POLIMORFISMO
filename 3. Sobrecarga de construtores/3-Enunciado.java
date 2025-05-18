class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade);
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Lápis", 1.50);
        Produto p3 = new Produto("Caderno", 15.00, 20);

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}