package Exer8Chapter5;

import Exer1Chapter5.Checker;

import java.util.Calendar;

public class Exer8Chapter5 {

    public static void main(String args[]){
        Calendar date1 = Calendar.getInstance();

        date1.set(Calendar.DAY_OF_MONTH, 1);
        date1.set(Calendar.MONTH, 1);
        date1.set(Calendar.YEAR, 2020);
        date1.set(Calendar.HOUR_OF_DAY, 0);
        date1.set(Calendar.MINUTE, 0);
        date1.set(Calendar.SECOND, 0);
        date1.set(Calendar.MILLISECOND, 0);
        Calendar date2 = Calendar.getInstance();
        date2.set(Calendar.DAY_OF_MONTH, 21);
        date2.set(Calendar.MONTH,1);
        date2.set(Calendar.YEAR, 2020);
        date2.set(Calendar.HOUR_OF_DAY, 0);
        date2.set(Calendar.MINUTE, 0);
        date2.set(Calendar.SECOND, 0);
        date2.set(Calendar.MILLISECOND, 0);
        Calendar resultado = Checker.whichIsTheBiggerDate(date1, date2);
        System.out.println("A maior data é: ");
        System.out.println("Dia: " + resultado.get(Calendar.DAY_OF_MONTH) + "/" + resultado.get(Calendar.MONTH) + "/"
                + resultado.get(Calendar.YEAR));
        System.out.println("Hora: " + resultado.get(Calendar.HOUR_OF_DAY) + ":" + resultado.get(Calendar.MINUTE) + ":"
                + resultado.get(Calendar.SECOND) + ":" + resultado.get(Calendar.MILLISECOND));
    }
}