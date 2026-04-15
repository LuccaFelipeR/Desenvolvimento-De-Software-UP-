package Exercicio02;

import java.util.Scanner;

class Produto {
    private double preco;

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        p.setPreco(preco);

        System.out.println("Preço: " + p.getPreco());

        sc.close();
    }
}