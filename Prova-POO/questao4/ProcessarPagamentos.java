package prova.questao4;

import java.math.BigDecimal;

class Compra {
   
    BigDecimal valor;
    String Escolha;
 // vai definir o valor da compra.
    public Compra(BigDecimal valor) {
        this.valor = valor;
    }
 //vai   iniciar o procesamento dependendo da  escolha do cliente.
    void processarCompra(Pagamento Pagamento) {
        Pagamento.pagar(this);
    }
 //vai definir o metodo de pagamento que o cliente escolheu.
    void EscolherPagamento(String Escolha){
        if (Escolha == "Pix" ){
            processarCompra(new Px());
        }
        if (Escolha == "Credito" ){
            processarCompra(new CartaoCredito());
        }
        if (Escolha == "Boleto" ){
            processarCompra(new Boleto());
        }
        if(Escolha != "Credito" && Escolha != "Boleto" && Escolha != "Pix" ){
            System.out.println("Método de pagamento inexistente.");
        }
        
    }
}




    

