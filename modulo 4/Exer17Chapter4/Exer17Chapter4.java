package Exer17Chapter4;

import Exer13Chapter4.Person;

import java.util.ArrayList;
import java.util.List;


public class Exer17Chapter4 {

    public static void main(String args[]) {
        List <Sala> salas = new ArrayList<>();
        List <Person> alunos1ano = new ArrayList<>();
        List <Person> alunos2ano = new ArrayList<>();
        Sala classe1 = new Sala();
        Sala classe2 = new Sala();
        Escola escola = new Escola("Zup Feliz", "123456789", salas);
        Person pedrinho = new Person();
        pedrinho.setNome("Pedrinho");
        Person tiago = new Person();
        tiago.setNome("Tiago");
        Person mariazinha = new Person();
        mariazinha.setNome("Mariazinha");
        alunos1ano.add(pedrinho);
        alunos2ano.add(tiago);
        alunos2ano.add(mariazinha);
        escola.getSala().add(classe1);
        escola.getSala().add(classe2);
        escola.getSala().get(0).setAlunos(alunos1ano);
        escola.getSala().get(1).setAlunos(alunos2ano);
        for(int i =0; i< escola.getSala().get(0).getAlunos().size(); i++){
            System.out.println("Sala1: "+ escola.getSala().get(0).getAlunos().get(i).getNome());
        }
        for(int i =0; i< escola.getSala().get(1).getAlunos().size(); i++){
            System.out.println("Sala2: "+ escola.getSala().get(1).getAlunos().get(i).getNome());
        }
        escola.trocaAluno(pedrinho,tiago,escola,0,1);
        System.out.println();
        for(int i =0; i< escola.getSala().get(0).getAlunos().size(); i++){
            System.out.println("Sala1: "+ escola.getSala().get(0).getAlunos().get(i).getNome());
        }
        for(int i =0; i< escola.getSala().get(1).getAlunos().size(); i++){
            System.out.println("Sala2: "+ escola.getSala().get(1).getAlunos().get(i).getNome());
        }
    }
}