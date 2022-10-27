package prova.questao1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.getValorProdutos();
//informando o produto que quer
        shop.setProduto("Arroz");

        shop.setProduto("Arroz");

        shop.setProduto("Carne");

        shop.setProduto("Feijao");

        shop.setProduto("Feijao");
        
        shop.setProduto("Macarrao");

        shop.setProduto("Sal");
//vai informar o valor da compra
        shop.getValorCompra();
// vai informar os produtos no carrinho
        shop.getProdutos();

    }
    
}
