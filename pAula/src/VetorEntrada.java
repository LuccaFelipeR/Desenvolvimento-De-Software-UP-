import java.util.Scanner;

public class VetorEntrada {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();

        System.out.println("\n--- Números Digitados ---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        entrada.close();
    }
}