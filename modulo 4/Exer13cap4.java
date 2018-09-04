package ExerciciosChapter4;

public class Exer13cap4 {

    public static void main (String args[]){
        Cadastro cad []= new Cadastro[100];
        cad[0] = new Cadastro();
        cad[0].cadastrar();
        cad[0].getPe()[0].status();
        cad[0].apagarCadastro(cad,0);
    }
}