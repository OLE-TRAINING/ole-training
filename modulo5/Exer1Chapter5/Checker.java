package Exer1Chapter5;

import java.util.Calendar;

public class Checker {

    public static void checkWordLength(String word, int MAX_LENGTH_WORD) {
        if(word == null){
            System.out.println("Erro: String vazia.");
        }
        if (word.length() > MAX_LENGTH_WORD) {
            System.out.println("Você ultrapassou o limite de caracteres.");
        }
    }

    public static void checkStartWith(String word, char FIRST_CHARACTER) {
        if(word == null){
            System.out.println("Erro: String vazia.");
        }
        System.out.println(word.charAt(0) == FIRST_CHARACTER ? "Primeiro caractere válido." : "Primeiro caractere inválido.");
    }

    public static String return4Characters(String word) {
        if(word == null){
            System.out.println("Erro: String vazia.");
        }
        word = word.toUpperCase().substring(0, 4);
        return word;
    }

    public static void containNumber(String word) {
        if(word == null){
            System.out.println("Erro: String vazia.");
        }
        boolean hasNumber = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                hasNumber = true;
                break;
            }
        }
        System.out.println(hasNumber ? "Tem Número." : "Não tem número.");
    }

    public static void whichIsTheBigger(int number, int number2) {
        System.out.println(number > number2 ? "O número " + number + " é o maior." : "O número " + number2 + " é o maior.");
    }

    public static void howMuchTimeLeft(Calendar now, Calendar event) {
        if(now == null || event ==null){
            System.out.println("Erro: Datas vazia.");
        }
        MillisecondsCoverter.diferenceInDetails(now,event);
    }

    public static Calendar whichIsTheBiggerDate(Calendar date1, Calendar date2) {
        if(date1 == null || date2 ==null){
            System.out.println("Erro: Datas vazia.");
        }
        if (((date1.getTimeInMillis() - date2.getTimeInMillis()) > MillisecondsCoverter.millisecondsInDays(20) )
                || ((date2.getTimeInMillis() - date1.getTimeInMillis()) > MillisecondsCoverter.millisecondsInDays(20))) {
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