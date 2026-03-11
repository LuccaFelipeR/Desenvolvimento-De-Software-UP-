import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        int operac = 0;

        System.out.println(" \n Informe o primeiro numero para operação;");
        numero1 = entrada.nextDouble();
        System.out.println(" \n Informe o segundo numero para operação;");
        numero2 = entrada.nextDouble();
        System.out.println(
                " \n Qual operação você gostaria de efetuar;\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
        operac = entrada.nextInt();
        switch (operac) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado final:" + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado final:" + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado final:" + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado final:" + resultado);
                break;
            default:
                System.out.println("Número inválido! Digite de 1 a 4.");
        }
        ;
        entrada.close();
    };
};
