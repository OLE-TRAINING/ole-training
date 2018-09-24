package Exer1Chapter5;

import java.util.Calendar;

public class MillisecondsCoverter {

    public static long diferenceInSeconds(Calendar now, Calendar event){
        long finalDate = event.getTimeInMillis();
        long inicialDate = now.getTimeInMillis();
        long totalMilliseconds = (finalDate - inicialDate);
        long totalSeconds = totalMilliseconds / 1000;
        return totalSeconds;
    }

    public static void diferenceInDetails(Calendar now, Calendar event){
        long totalSeconds = diferenceInSeconds(now, event);
        long segundos = (((((totalSeconds % 31536000) % 2628000) % 86400) % 3600) % 60);
        long minutos = ((((totalSeconds % 31536000) % 2628000) % 86400) % 3600) / 60;
        long horas = (((totalSeconds % 31536000) % 2628000) % 86400) / 3600;
        long dias = ((totalSeconds % 31536000) % 2628000) / 86400;
        long mes = (totalSeconds % 31536000) / 2628000;
        long ano = totalSeconds / 31536000;
        System.out.println("Falta(m) " + ano + " ano(s), " + mes + " mes(es), " + dias + " dia(s), " + horas + " hora(s), "
                + minutos + " minuto(s) e " + segundos + " segundo(s) para o seu evento.");
    }

    public static long millisecondsInDays(int daysNumber){
        long ONE_DAY_MS = 86400000;
        return ONE_DAY_MS*daysNumber;
    }
}