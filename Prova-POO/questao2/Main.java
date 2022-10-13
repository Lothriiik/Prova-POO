package prova.questao2;

public class Main {
    public static void main(String[] args) {
        Parking est = new Parking();
        est.setCarros_Pessoas("SUV", 5);

        est.setCarros_Pessoas("GOL", 3);

        est.setCarros_Pessoas("CELTA", 4);

        est.setCarros_Pessoas("FERRARI", 2);

        est.setCarros_Pessoas("MUSTANG", 2);
        
        est.getTotal_Pessoas();

        est.getEstacionamento();

    
    }
    
}
