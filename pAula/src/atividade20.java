public class atividade20 {

    public static void alterarPrimeiroElemento(int[] vetorRecebido) {
        vetorRecebido[0] = 999;
        System.out.println("Dentro do método (alterado): " + vetorRecebido[0]);
    }

    public static void main(String[] args) {

        int[] meuVetor = { 10, 20, 30 };

        System.out.println("No main antes da alteração: " + meuVetor[0]);

        alterarPrimeiroElemento(meuVetor);

        System.out.println("No main depois da alteração: " + meuVetor[0]);
    }
}