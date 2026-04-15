package Exercicio03;

import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;

        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            this.nota = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        Aluno a = new Aluno(nome, nota);

        System.out.println(a.getNome() + " - " + a.getNota());

        sc.close();
    }

}