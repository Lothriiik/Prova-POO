package prova.questao5 ;

class Escolhendo{
   
    String Escolha;
//iniciar a conexão
    void iniciarConexao(){
        System.out.println("Iniciando conexão...");

    }
//finaliza a conexão
    void EncerrarConexao(){
        System.out.println("Encerrando conexão");

    }
//começa o processamento da conexão
    void processarConexao(Conexao Conexao) {
        iniciarConexao();
        Conexao.escolheu(this);
        EncerrarConexao();
    }
//vai definir o metodo de conexao dependendo da escolha.
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




    

