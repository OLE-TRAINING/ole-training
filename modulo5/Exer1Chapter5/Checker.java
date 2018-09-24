package Exer1Chapter5;

import java.util.Calendar;

public class Checker {

    public static void checkCharacters(String word) {
        if (word.length() > 8) {
            System.out.println("Você ultrapassou o limite de caracteres.");
        }
    }

    public static void checkFirstCharacters(String word) {
        if (word.charAt(0) == 'A') {
            System.out.println("Primeiro caractere válido!");
        } else {
            System.out.println("Primeiro caractere inválido!");
        }
    }

    public static String return4Characters(String word) {
        word = word.toUpperCase().substring(0, 4);
        return word;
    }

    public static void containNumber(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 48 && word.charAt(i) <= 57) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Tem número.");
        } else {
            System.out.println("Não tem número.");
        }
    }

    public static void whichIsTheBigger(int number, int number2) {
        if (number > number2) {
            System.out.println("O número " + number + " é o maior.");
        } else {
            System.out.println("O número " + number2 + " é o maior.");
        }
    }

    public static void howMuchTimeLeft(Calendar now, Calendar event) {
        long finalDate = event.getTimeInMillis();
        long inicialDate = now.getTimeInMillis();
        long totalMilliseconds = (finalDate - inicialDate);
        long totalSeconds = totalMilliseconds / 1000;
        long segundos = (((((totalSeconds % 31536000) % 2628000) % 86400) % 3600) % 60);
        long minutos = ((((totalSeconds % 31536000) % 2628000) % 86400) % 3600) / 60;
        long horas = (((totalSeconds % 31536000) % 2628000) % 86400) / 3600;
        long dias = ((totalSeconds % 31536000) % 2628000) / 86400;
        long mes = (totalSeconds % 31536000) / 2628000;
        long ano = totalSeconds / 31536000;
        System.out.println("Falta(m) " + ano + " ano(s), " + mes + " mes(es), " + dias + " dia(s), " + horas + " hora(s), "
                + minutos + " minuto(s) e " + segundos + " segundo(s) para o seu evento.");
    }

    public static Calendar whichIsTheBiggerDate(Calendar date1, Calendar date2) {
        if (((date1.getTimeInMillis() - date2.getTimeInMillis()) > 1728000000 )
                || ((date2.getTimeInMillis() - date1.getTimeInMillis()) > 1728000000)) {
            System.out.println("Tem mais de 20 dias de diferença entre as datas.");
        }
        if (date1.compareTo(date2) == 0) {
            System.out.println("As datas são iguais.");
            return date1;
        } else if (date1.compareTo(date2) > 0) {
            return date1;
        } else {
            return date2;
        }
    }
}