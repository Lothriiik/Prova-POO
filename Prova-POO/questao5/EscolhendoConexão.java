package prova.questao5 ;

class Escolhendo{
   
    String Escolha;
   
    void iniciarConexao(){
        System.out.println("Iniciando conexão...");

    }
    void EncerrarConexao(){
        System.out.println("Encerrando conexão");

    }
    void processarConexao(Conexao Conexao) {
        iniciarConexao();
        Conexao.escolheu(this);
        EncerrarConexao();
    }
    void EscolherConexao(String Escolha){
        if (Escolha == "Serial" ){
            processarConexao(new Serial());
        }
        if (Escolha == "Pacote" ){
            processarConexao(new Pacote());
        }
        if(Escolha != "Pacote" && Escolha != "Serial" ){
            System.out.println("Método de Conexão inexistente.");
        }
    
    }
    
}




    

