package ExerciciosChapter4;

public class Exer10cap4 {

    public static void main (String args[]){
        Endereco end = new Endereco();
        end.setEstado("MG");
        end.setCidade("Uberlândia");
        end.setBairro("Santa Mônica");
        end.setRua("Rua 4");
        end.setCep("38408-208");
        end.setTelefone("3217-1205");

        end.endStatus();
    }
}