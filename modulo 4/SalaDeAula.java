package ExerciciosChapter4;

import java.util.Scanner;

public class SalaDeAula {
    Aluno students [] = new Aluno[10];

    public SalaDeAula(Aluno [] students) {
        if(students.length>10){
            System.out.println("Quantidade de aluno inválida");
        } else {
            this.students = students;
        }
    }

    public class Aluno{
        String Nome;
        int matricula;
        String professor;
    }
}
