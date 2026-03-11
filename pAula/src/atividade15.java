import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double media = 0;

        System.out.println(" \n Informa a Nota da 1° Prova;");
        numero1 = entrada.nextDouble();
        System.out.println(" \n Informa a Nota da 2° Prova;");
        numero2 = entrada.nextDouble();
        System.out.println(" \n Informa a Nota da 3° Prova;");
        numero3 = entrada.nextDouble();

        media = numero1 + numero2 + numero3 / 3;
        if (media >= 7) {
            System.out.println("Aluno Aprovado, Nota final " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperação, Nota final " + media);

        } else {
            System.out.println("Aluno Reprovado, Nota final " + media);
        }
        ;
        entrada.close();
    };
};
