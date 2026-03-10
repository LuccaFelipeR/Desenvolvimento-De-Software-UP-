import java.util.Scanner;

public class atividade05 {
   public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.println("Informe a medida do lado A: ");
      double medida1 = entrada.nextDouble();

      System.out.println("Informe a medida do lado B: ");
      double medida2 = entrada.nextDouble();

      System.out.println("Informe a medida do lado C: ");
      double medida3 = entrada.nextDouble();

      if (medida1 + medida2 > medida3 &&
            medida1 + medida3 > medida2 &&
            medida2 + medida3 > medida1) {

         if (medida1 == medida2 && medida2 == medida3) {
            System.out.println("Triangulo Equilatero");

         } else if (medida1 == medida2 || medida1 == medida3 || medida2 == medida3) {
            System.out.println("Triangulo Isoceles");

         } else {
            System.out.println("Triangulo Escaleno");
         }

      } else {
         System.out.println("As medidas informadas nao formam um triangulo.");
      }

      entrada.close();
   }
}