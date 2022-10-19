package prova.questao1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.getValor_Produtos();
//informando o produto que quer
        shop.setProduto("Arroz");

        shop.setProduto("Arroz");

        shop.setProduto("Carne");

        shop.setProduto("Feijao");

        shop.setProduto("Feijao");
        
        shop.setProduto("Macarrao");

        shop.setProduto("Sal");
//vai informar o valor da compra
        shop.getValor_Compra();
// vai informar os produtos no carrinho
        shop.getProdutos();

    }
    
}
