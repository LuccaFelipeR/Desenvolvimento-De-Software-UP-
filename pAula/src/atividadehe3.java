class Veiculo {

    String marca;
    String modelo;
}

class Carro extends Veiculo {

    int portas;
}

class Moto extends Veiculo {

    double clindradas;
}

public class atividadehe3 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Moto moto1 = new Moto();

        carro1.marca = "BmW";
        carro1.modelo = "X6";
        carro1.portas = 4;

        moto1.marca = "Honda";
        moto1.modelo = "CB300";
        moto1.clindradas = 300.0;

        System.out.println("Carro:");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Portas: " + carro1.portas);

        System.out.println("\nMoto:");
        System.out.println("Marca: " + moto1.marca);
        System.out.println("Modelo: " + moto1.modelo);
        System.out.println("Cilindradas: " + moto1.clindradas);
    }
}
