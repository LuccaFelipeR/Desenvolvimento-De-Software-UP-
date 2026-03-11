import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {

        double numero1;
        double numero2;
        double numero3;
        double numero4;
        double numero5;
        double soma;

        Scanner entrada = new Scanner(System.in);

        System.out.println(" \nInforme o 1° Numero;");
        numero1 = entrada.nextDouble();
        System.out.println(" \nInforme o 2° Numero;");
        numero2 = entrada.nextDouble();
        System.out.println(" \nInforme o 3° Numero;");
        numero3 = entrada.nextDouble();
        System.out.println(" \nInforme o 4° Numero;");
        numero4 = entrada.nextDouble();
        System.out.println(" \nInforme o 5° Numero;");
        numero5 = entrada.nextDouble();

        soma = numero1 + numero2 + numero3 + numero4 + numero5;

        System.out.println(" \nA Soma dos Numeros eh: " + soma);
        entrada.close();
    };
};
