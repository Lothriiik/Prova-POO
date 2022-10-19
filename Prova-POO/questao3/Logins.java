package prova.questao3;

interface Plataforma {

    void escolheu(Login Login);

}
// dependendo da plataforma que ele escolheu vai iniciar o procedimento daquela plataforma.
class Formulario implements Plataforma {

    @Override
    public void escolheu(Login Login) {
        System.out.println("Escolheu o método de login pelo Formulário.");
    }
}

class Google implements Plataforma {

    @Override
    public void escolheu(Login Login) {
        System.out.println("Escolheu o método de login pelo Google.");
    }
}

class Facebook implements Plataforma {

    @Override
    public void escolheu(Login Login) {
        System.out.println("Escolheu o método de login pelo Facebook.");
    }
}

class iCloud implements Plataforma {

    @Override
    public void escolheu(Login Login) {
        System.out.println("Escolheu o método de login pelo iCloud");
    }
}
