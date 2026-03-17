import java.util.Scanner;

public class atividade22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float[] numeros = new float[10];

        float soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextFloat();
            soma += numeros[i];
        }
        float maior = numeros[0];
        float menor = numeros[0];

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        float media = soma / 10;

        System.out.print("1. Números digitados: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " | ");
        }

        System.out.println("\n2. Soma dos números: " + soma);
        System.out.println("3. Média aritmética: " + media);
        System.out.println("4. Maior número: " + maior);
        System.out.println("5. Menor número: " + menor);

        leitor.close();
    }
}