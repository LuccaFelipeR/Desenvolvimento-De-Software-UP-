import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println(" \n Selecione uma linguagem surpresa para seus estudos:");
        numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Você escolheu: Java");
                break;
            case 2:
                System.out.println("Você escolheu: Python");
                break;
            case 3:
                System.out.println("Você escolheu: JavaScript");
                break;
            default:
                System.out.println("Número inválido! Digite de 1 a 3.");
        }
        entrada.close();
    };
};
