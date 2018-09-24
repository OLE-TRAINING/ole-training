package Exer5Chapter5;

import Exer1Chapter5.Checker;

import java.util.Random;

public class Exer5Chapter5 {

    public static void main (String args []){
        Random randomNumber = new Random();
        int number = randomNumber.nextInt();
        System.out.println("O número 1 gerado foi = "+ number);
        int number2 = randomNumber.nextInt();
        System.out.println("O número 2 gerado foi = "+ number2);
        Checker.whichIsTheBigger(number,number2);
    }
}
