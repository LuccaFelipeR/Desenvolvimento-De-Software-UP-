import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" \n Contagem Regressiva, Informe um Numero;");
        i = entrada.nextInt();
        while (i >= 0) {
            System.out.println("Numero:" + i);
            i--;
        }
        ;
        entrada.close();
    };
};