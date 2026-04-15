package Exercicio05;

import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            preco = preco - (preco * percentual / 100);
        }
    }

    public double getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Desconto (%): ");
        double desconto = sc.nextDouble();

        Produto p = new Produto(nome, preco);
        p.aplicarDesconto(desconto);

        System.out.println("Preço final: " + p.getPreco());
        sc.close();
    }
}