package prova.questao2;

import java.util.HashMap;
import java.util.Map;

public class Parking {
    
    private String Carros;
    private Integer Pessoas;
    
    Integer TotalPessoas = 0;
    Integer TotalCarros = 0;
    
    Map<String, Integer> estacionamento = new HashMap<>();
//vai informar o carro e  quantas pessoa tem nele  e adicionar ao estacionamento.
    public String setCarrosPessoas(String Carros2, Integer Pessoas2) {
        this.Carros = Carros2;
        this.Pessoas = Pessoas2;
        this.TotalPessoas += Pessoas2;
        this.TotalCarros +=1;
// adiciona ao estacionamento.
        setEstacionamento();
        return this.Carros;
	}
// vai informar o total de pessoas e carros no estaciomaneto.
    void getTotalPessoas(){
        System.out.println("Tem um total de " + Total_Pessoas + " pessoas no estacionamento e um total de " + Total_Carros + " carros no estacionamento.");
        
    }
//adiciona carro ao estacionamento.
    void setEstacionamento(){
        estacionamento.put(Carros, Pessoas);
        
    }
//informa o veiculo e quantas pessoas tem nele.
    void getEstacionamento(){
        for(String key : estacionamento.keySet()){
            System.out.println(key + ": " + estacionamento.get(key)+ " pessoas.");
        }
    }

}
