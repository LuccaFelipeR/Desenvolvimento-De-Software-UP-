import java.util.Scanner;

//Aluno: Lucca Felipe Burgos Rabelo 3° Semestre


//EXERCICIO 1 

// class → É a estrutura principal onde o programa é criado. 
// Todo código Java fica dentro de uma classe.

// main → É o método principal onde o programa começa a execução

// System.out.println → Mostra a saida de dados

// Scanner → entrada de dados solicitada da maquina ao usuario

/* 
import java.util.Scanner;
public class prova {
public static void main(String[] args) {

System.out.println("Olá mundo");

Scanner sc = new Scanner(System.in);

int numero = sc.nextInt();

System.out.println("Número digitado: " + numero);

sc.close();

};
};
*/


//EXERCICIO 2
/* 
public class prova {
    public static void main(String[] args) {

        int a = 10;
        double b = 3.5;
        double resultado = a / b;

        System.out.println(resultado); // saída: 2.857142857142857
    };
};

*/

//EXERCICIO 3
/* 
public class prova {
public static void main(String[] args) {
int x = 10;
int y = 20;
boolean resultado = (x < y) && (y > 15);
System.out.println(resultado); 

// saída: true ou verdadeiro
    };
};
*/


//EXERCICIO 4

/* 
    public class prova {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n > 0) {
        System.out.println("Positivo");
    } else if (n < 0) {
        System.out.println("Negativo");
    } else {
    System.out.println("Zero");
        };
    };
};
*/


//EXERCICIO 5
/* 
    public class prova {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int dia = sc.nextInt();

        switch (dia) {
        case 1: System.out.println("Domingo"); break;
        case 2: System.out.println("Segunda"); break;
        case 3: System.out.println("Terça"); break;
        case 4: System.out.println("Quarta"); break;
        case 5: System.out.println("Quinta"); break;
        case 6: System.out.println("Sexta"); break;
        case 7: System.out.println("Sábado"); break;
    default: System.out.println("Inválido");
        };
    };
};
*/

//EXERCICIO 6

/*
public class prova {
    public static void main(String[] args) {

        int in = 1;
        int soma = 0;

        while (in <= 100){
            
            
            soma += in;
            in++;

            System.out.println("Ordem de Soma: " + soma);
        }
        
        System.out.println("Soma: " + soma);

        // resultaDo; 5050

    }
}
*/


//EXERCICIO 7

/*
public class prova {
    public static void main(String[] args) {


      for(int i = 0; i <=20 ;i++){
            if (i % 2 == 0) {
                System.out.println(i);

        }
        }
    }
}
*/

    //EXERCICIO 8
/* 
    public class prova {
    public static void main(String[] args) {


        int[] vetorz = {10, 5, 30, 2, 15};
        int maior = vetorz[0];
        int menor = vetorz[0];


        for (int i = 1; i < vetorz.length; i++) {
            if (vetorz[i] > maior) {
                maior = vetorz[i];
            }
            if (vetorz[i] < menor){
                menor = vetorz[i];
            }
    }
        System.out.println("O Numero maior eh; " + maior);
        System.out.println("O Menor numero eh: " + menor);
        }
    }
*/

    //EXERCICIO 9

    /* 
    public class prova {
    public static void main(String[] args) {

        int[][] m = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };

                int soma = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        soma += m[i][j];
                    }
                }

                System.out.println(soma); // 45
        };
    };
*/

    //EXERCICIO 10
/*
    public class prova {
    static void alterar(int[] v){
        v[0] = 50;
 };
    public static void main(String[] args){
    
        int[] vetor = {10,20,30};
        
        alterar(vetor);
        
        System.out.println(vetor[0]);
        };
    }; //saida foi 50
*/
