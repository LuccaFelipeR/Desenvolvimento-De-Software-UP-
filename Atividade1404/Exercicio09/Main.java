package Exercicio09;

import java.util.ArrayList;
import java.util.Scanner;

class Pedido {
    private ArrayList<String> produtos;

    public Pedido() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String p) {
        produtos.add(p);
    }

    public ArrayList<String> getProdutos() {
        return produtos;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido p = new Pedido();

        System.out.print("Quantos produtos deseja adicionar? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Produto: ");
            String nome = sc.nextLine();
            p.adicionarProduto(nome);
        }

        System.out.println("Lista: " + p.getProdutos());
    }
}