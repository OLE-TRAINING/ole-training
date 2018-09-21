package ExerciciosChapter4;

public class Exer8cap4 {

    public static void main(String args[]){
        Pessoa people [] = new Pessoa[2];
        people[0] = new Pessoa("Paulo",26,"09876789095");
        people[1] = new Pessoa("Tiago", 28,"09898754664");
        people[0].status();
        people[1].status();
    }
}
