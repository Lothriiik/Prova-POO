package prova.questao4;

import java.math.BigDecimal;

class Compra {
   
    BigDecimal valor;
    String Escolha;
   
    public Compra(BigDecimal valor) {
        this.valor = valor;
    }
    
    void processarCompra(Pagamento Pagamento) {
        Pagamento.pagar(this);
    }
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




    

