class Animal {
    String nome;
}

class Cachorro extends Animal {
    String raca;

}

public class atividadehe2 {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Amsterdãm";
        cachorro1.raca = "Pitbull";

        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Raça: " + cachorro1.raca);

    }
}
