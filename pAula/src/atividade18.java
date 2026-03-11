import java.util.Scanner;

public class atividade18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verificador de Números Pares e Ímpares\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é PAR.\n");
            } else {
                System.out.println("O número " + numero + " é ÍMPAR.\n");
            }
        }

        entrada.close();
    }
}