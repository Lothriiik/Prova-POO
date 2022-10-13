package prova.questao4;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o valor do pagamento:");
        BigDecimal valor = new BigDecimal("130.89");
        Compra compra = new Compra(valor);
        System.out.println("Escolha a forma de pagamento (Pix/Credito/Boleto):");
        compra.EscolherPagamento("Pix");
    }

}

