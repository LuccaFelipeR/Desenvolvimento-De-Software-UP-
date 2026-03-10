import java.util.Scanner;

public class atividade11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int soma = 0;
        while (numero != 0) {
            System.out.println("Digite um numero (0 para sair):");
            numero = entrada.nextInt();
            soma += numero;
        }
        ;
        System.out.println("Programa Finalizado!\n Soma total dos Numeros:" + soma);
        entrada.close();
    };
};
