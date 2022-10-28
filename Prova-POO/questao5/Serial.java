package ProvaPOO.questao5;

class ProcessadorConexaoSerial extends ProcessadorConexao {

    @Override
    protected void conectar() {
        System.out.println("Iniciando conexão Serial...");
    }
    
}