import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero;");
        numero = entrada.nextInt();
        System.out.print("O Numero Informado foi:");
        System.out.print(numero);

        entrada.close();
    }
}
