import java.util.Scanner;

public class atividade22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float[] numeros = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextFloat();
        }

        float soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + numeros[i];
        }
        float media = soma / 10;

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

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        leitor.close();
    }
}