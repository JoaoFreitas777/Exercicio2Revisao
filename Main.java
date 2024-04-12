public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        Produto produto2 = new Produto("Tênis", 99.99, 20);

        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Produto 2:");
        produto2.exibirInformacoes();
        System.out.println();

        produto1.setPreco(39.99);
        produto1.setQuantidadeEmEstoque(40);

        System.out.println("Informações atualizadas do Produto 1:");
        produto1.exibirInformacoes();
    }
}