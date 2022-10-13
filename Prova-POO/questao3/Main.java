package prova.questao3;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        System.out.println("Escolha o metodo de login (Formulario/Google/Facebook/iCloud):");
        login.EscolherPlataforma("Google");
    }

}

