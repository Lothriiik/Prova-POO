package prova.questao2;

public class Main {
    public static void main(String[] args) {
        Parking est = new Parking();
        est.setCarrosPessoas("SUV", 5);

        est.setCarrosPessoas("GOL", 3);

        est.setCarrosPessoas("CELTA", 4);

        est.setCarrosPessoas("FERRARI", 2);

        est.setCarrosPessoas("MUSTANG", 2);
        
        est.getTotalPessoas();

        est.getEstacionamento();

    
    }
    
}
