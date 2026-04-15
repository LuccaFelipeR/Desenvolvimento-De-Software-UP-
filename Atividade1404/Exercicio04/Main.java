package Exercicio04;

import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria c = new ContaBancaria();

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        c.setSaldo(saldo);

        System.out.println("Saldo: " + c.getSaldo());
        sc.close();
    }
}