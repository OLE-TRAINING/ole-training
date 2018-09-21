package ExerciciosChapter4;

import java.util.Scanner;

public class Exer5cap4 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        PlanoCartesiano decartesPlan = new PlanoCartesiano();
        System.out.print("Digite o valor de X: ");
        decartesPlan.setX(sc.nextDouble());
        System.out.print("Digite o valor de Y: ");
        decartesPlan.setY(sc.nextDouble());
    }
}