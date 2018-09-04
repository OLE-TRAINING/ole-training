package ExerciciosChapter4;

public class Exer4cap4 {

    public static void main (String args[]){
        Contador cont = new Contador(1000);
        System.out.print("Valor inicial: ");
        cont.showValorInicial();
        cont.decrementar();
        System.out.print("Valor após decremento: ");
        cont.showValorAtual();
        while(cont.getValorInicial() <1567){
            cont.incrementar();
        }
        System.out.print("Valor Atual (após incrementos): ");
        cont.showValorAtual();
    }
}
