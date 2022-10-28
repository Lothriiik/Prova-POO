package ProvaPOO.questao5;


abstract class ProcessadorConexao {
    
    public void processarConexao() {
        iniciar();
        conectar();
        finalizar();
    }

    protected abstract void conectar();

    private void iniciar() {
        System.out.println("Iniciando conexão...");
    }
    
    protected void finalizar() {
        System.out.println("Finalizando conexão.");
    }
    
}

