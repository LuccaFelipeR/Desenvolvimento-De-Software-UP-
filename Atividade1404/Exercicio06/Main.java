package Exercicio06;

import java.util.Scanner;

class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        Aluno a = new Aluno(nome);

        System.out.println("Aluno: " + a.getNome());
        sc.close();
    }
}