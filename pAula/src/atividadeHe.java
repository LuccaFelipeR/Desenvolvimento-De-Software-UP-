class Pessoa {
    String nome;
    int idade;
}

class Funcionario extends Pessoa {
    double salario;

}

public class atividadeHe {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Lucca";
        funcionario1.idade = 20;
        funcionario1.salario = 7420.4;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Idade: " + funcionario1.idade);
        System.out.println("Salário: " + funcionario1.salario);

    }

}