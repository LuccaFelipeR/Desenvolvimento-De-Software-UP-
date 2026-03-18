import java.util.Scanner;
public class prova2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = {"1. AirMax Tn1","2. AirMax Tn3", "3. AirForce One"};
        double[] precos = {49.90, 99.00, 189.90};

        double totalCompra = 0;
        int opcao = 0;
        double exibirProdutos;
        
        do {
         System.out.println ("================ BURTAN STORE ================");
         System.out.println(" \n Escolher Produtos \n Realizar Compra \n Mais informações \n Finalizar\n");
        System.out.println ("========= SELECIONE UMA OPÇÃO A CIMA =========");
            opcao = scanner.nextInt(); // isso aqui ta forçando uma inserção de dados pegando o valor e salvando na variave

         switch (opcao) {
                case 1:
                    exibirProdutos(produtos, precos); //isso ta exibindo ps produto
                    break;

                case 2:
                    exibirProdutos(produtos, precos);
                    System.out.println("Adicione o produto a sua sacola: ");
                    int escolha = scanner.nextInt();

                    if (escolha >=1 && escolha <= produtos.length) {
                        totalCompra += precos[escolha - 1];
                        System.out.println(produtos[escolha - 1] + " adicionado ao carrinho.");

                        } else {
                        System.out.println("Digito de produto inválido!");
                        }
                        break;

                case 3:
                    System.out.println("Creditos: ByLucca \nSomos uma empresa criada desde 2020, com os melhore tenis do Brasil, trazendo qualidade e conforto,  sempre uma confiabilidade gigantesca com o clientwe. Obrigado!");

                case 4:
                    System.out.println("Finalizando sua compra... Volte Sempre!\n");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    }
                    
            } while (opcao != 4);
                System.out.printf("\n======= TOTAL DA COMPRA: R$%.2f =======\n", totalCompra);
                System.out.println("Obrigado por comprar conosco! Burtan Store Agradece! ");
            
                scanner.close(); //fechando scanner para nao ter qualquer outra informaçãop salva la
        }

    
    public static void exibirProdutos(String[] nomes, double[] valores) {
        System.out.println("==== Lista de Produtos ====");
            for (int i = 0 ; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " - R$ " + valores[i]);
            }
}

}


//Valeu pela prova, ajudou a exercitar a cabeça!


    