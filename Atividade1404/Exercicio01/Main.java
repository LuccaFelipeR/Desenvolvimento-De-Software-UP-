package Exercicio01;

import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;

        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        Pessoa p = new Pessoa(nome, idade);

        System.out.println(p.getNome() + " - " + p.getIdade());

        sc.close();
    }
}