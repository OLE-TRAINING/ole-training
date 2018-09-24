package Exer6Chapter5;

import Exer1Chapter5.Checker;

import java.util.Calendar;

public class Exer6Chapter5 {

    public static void main(String args[]) {
        Calendar event = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        event.set(Calendar.DAY_OF_MONTH, 01);
        event.set(Calendar.MONTH, 01);
        event.set(Calendar.YEAR, 2019);
        event.set(Calendar.HOUR_OF_DAY, 0);
        event.set(Calendar.MINUTE, 0);
        event.set(Calendar.SECOND, 0);
        Checker.howMuchTimeLeft(now,event);
    }
}