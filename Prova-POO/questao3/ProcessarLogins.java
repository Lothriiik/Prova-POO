package prova.questao3;


class Login {
   
    String Escolha;
   
    void processarPlataforma(Plataforma Plataforma) {
 // vai iniciar os procedimento apos escolher a plataforma.
        Plataforma.escolheu(this);
    }
 //vai definir qual plataforma escolheu
    void EscolherPlataforma(String Escolha){
        if (Escolha == "Formulario" ){
            processarPlataforma(new Formulario());
        }
        if (Escolha == "Google" ){
            processarPlataforma(new Google());
        }
        if (Escolha == "Facebook" ){
            processarPlataforma(new Facebook());
        }
        if (Escolha == "iCloud" ){
            processarPlataforma(new iCloud());
        }
        if (Escolha != "iCloud" && Escolha != "Facebook" && Escolha != "Google" && Escolha != "Formulario"){
            System.out.println("Método de login inexistente.");
        }
        
    }
}




    

