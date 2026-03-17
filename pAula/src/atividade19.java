public class atividade19 {

    public static void alterarValor(int numeroMetodo) {
        numeroMetodo = 666;

        System.out.println("Valor modificado para: " + numeroMetodo);
    }

    public static void main(String[] args) {

        int numeroOriginal = 10;
        System.out.println("Valor original: " + numeroOriginal);

        alterarValor(numeroOriginal);

        System.out.println("Valor original continua sendo: " + numeroOriginal);
    }
}