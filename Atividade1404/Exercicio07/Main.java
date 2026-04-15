package Exercicio07;

import java.util.Scanner;

class Carro {
    private String marca;
    private int velocidade;

    public Carro(String marca) {
        this.marca = marca;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidade += valor;
        }
    }

    public void frear(int valor) {
        if (valor > 0 && velocidade - valor >= 0) {
            velocidade -= valor;
        } else {
            velocidade = 0;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        Carro c = new Carro(marca);

        System.out.print("Acelerar quanto? ");
        int acel = sc.nextInt();

        System.out.print("Frear quanto? ");
        int freio = sc.nextInt();

        c.acelerar(acel);
        c.frear(freio);

        System.out.println("Velocidade final: " + c.getVelocidade());
        sc.close();
    }
}