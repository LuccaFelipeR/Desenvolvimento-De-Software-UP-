import java.util.Scanner;
public class atividade02 { 
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int Idade;
        
        System.out.print("Olá boa noite, por gentileza nos informe sua idade: \n");
        Idade = entrada.nextInt();

        System.out.print("Sua idade eh? " + Idade);

        entrada.close();
    };

};
