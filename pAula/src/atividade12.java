import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        while (numero != 1234) {
            System.out.println("A Senha para acessar:");
            numero = entrada.nextInt();
            System.out.println("Senha Incorreta!\n");
        }
        ;
        System.out.println("Programa Acessado!");
        entrada.close();
    };
};
