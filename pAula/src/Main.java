import java.util.ArrayList;

class Produto {

    String mnome;
    double preco;
};

class carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    void listarProdutos() {
        System.out.println("Produtos no carrinho:");

        for (Produto p : produtos) {
            System.out.println(p.mnome + " - R$ " + p.preco);
        }
    }

    void calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.preco;
        }
        System.out.println("Total: R$ " + total);
    }

}

public class Main {
    public static void main(String[] args) {
        carrinho carrinho = new carrinho();

        Produto p1 = new Produto();
        p1.mnome = "Camisa";
        p1.preco = 50.0;

        Produto p2 = new Produto();
        p2.mnome = "Calça";
        p2.preco = 100.0;

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}
