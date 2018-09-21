package ExerciciosChapter4;

public class Exer11cap4 {

    public static void main (String args []){
        Pessoa people = new Pessoa("Paulo",26,"09876789095");
        Endereco end = new Endereco();
        people.getEnd().setEstado("MG");
        people.getEnd().setCidade("Uberlândia");
        people.getEnd().setBairro("Santa Mônica");
        people.getEnd().setRua("Rua 4");
        people.getEnd().setCep("38408-208");
        people.getEnd().setTelefone("3217-1205");
        people.status();
    }
}