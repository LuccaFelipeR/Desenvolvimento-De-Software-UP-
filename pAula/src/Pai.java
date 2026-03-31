class Pessoa {
    String nome;
    int idade;
}

class Aluno extends Pessoa {
    String curso;
}

public class Pai {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Gabriely";
        aluno1.idade = 20;
        aluno1.curso = "ADS";

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.curso);

    }

}