package prova.questao1;

import java.util.ArrayList;

public class Shop {
    private ArrayList<String> Compras = new ArrayList<String>();
    private String Produtos;
    private String Itens;
    private double Valor= 0;
    
//adiciona um produto
    public String setProduto(String Produtos2) {
        this.Produtos=Produtos2;
//coloca a compra no carrinho
        setCompras();
//adiciona o valor do produto ao valor total
        setValor();
        return this.Produtos;
	}
//coloca a compra no carrinho
    void setCompras(){
        Compras.add(Produtos);
    }
//vai dar o valor do produto com base no produto.
    private double setValor(){
        if (Produtos == "Arroz"){
            Valor += 4;
        }
        if (Produtos == "Carne"){
            Valor += 10;
        }
        if (Produtos == "Feijao"){
            Valor += 5;
        }
        if (Produtos == "Macarrao"){
            Valor += 3;
        }
        if (Produtos == "Sal"){
            Valor += 2;
        }
        return this.Valor;

    }
//vai informar os produtos
    void getValorProdutos(){
        System.out.printf("Os Produtos Vendidos são :\n   Arroz    R$: 4,00\n   Carne    R$: 10,00\n   Feijao   R$: 5,00\n   Macarrao R$: 3,00\n   Sal      R$: 2,00\n\n");
        
    }
//vai informar o valor total da compra
    void getValorCompra(){
        System.out.printf("A compra deu um valor total de R$: %.2f%n", Valor);
    }
//vai informar os produtos que estão no carrinho
    void getProdutos(){
        System.out.println("Os Produtos no carrinho  são: "+ Compras);
    }

}
