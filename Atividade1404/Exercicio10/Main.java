package Exercicio10;

import java.util.Scanner;

class Pedido {
    private double total;

    public Pedido(double total) {
        this.total = total;
    }

    public void aplicarDesconto(double valor) {
        if (valor >= 0 && total - valor >= 0) {
            total -= valor;
        }
    }

    public double getTotal() {
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total inicial: ");
        double total = sc.nextDouble();

        System.out.print("Desconto: ");
        double desconto = sc.nextDouble();

        Pedido p = new Pedido(total);
        p.aplicarDesconto(desconto);

        System.out.println("Total final: " + p.getTotal());
        sc.close();
    }
}