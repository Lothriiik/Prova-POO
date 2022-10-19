package prova.questao4;

interface Pagamento {

    void pagar(Compra compra);

}
// dependendo da forma de pagamento que escolheu vai iniciar o procedimento do respectivo metodo.
class Px implements Pagamento {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Realizou o pagamento pelo Pix no valor de R$: " + compra.valor);
    }
}

class CartaoCredito implements Pagamento {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Realizou o pagamento pelo Crédito no valor de R$: " + compra.valor);
    }
}

class Boleto implements Pagamento {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Realizou o pagamento pelo Boleto no valor de R$: " + compra.valor);
    }
}
