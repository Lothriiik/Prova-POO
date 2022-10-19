package prova.questao5;

interface Conexao {

    void escolheu(Escolhendo escolhendo);

}
// dependendo da conexao vai ter o seu respectivo metodo de processamento.
class Serial implements Conexao {

    @Override
    public void escolheu(Escolhendo escolhendo) {
        System.out.println("Processando os dados na forma de comunicação serial.");
    }
}

class Pacote implements Conexao {

    @Override
    public void escolheu(Escolhendo escolhendo) {
        System.out.println("Processando os dados na forma de comunicação baseado em pacotes.");
    }
}


