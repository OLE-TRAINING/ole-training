package Exer17Chapter4;

import Exer13Chapter4.Person;

import java.util.ArrayList;
import java.util.List;

public class Escola extends Sala{
    private String nomeEscola;
    private String cnpj;
    private List <Sala> sala;

    public Escola(String nomeEscola, String cnpj, List<Sala> sala) {
        this.nomeEscola = nomeEscola;
        this.cnpj = cnpj;
        this.sala = sala;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void trocaAluno (Person aluno1, Person aluno2, Escola escola, int indiceSalaOrigem1, int indiceSalaOrigem2){
        escola.getSala().get(indiceSalaOrigem2).getAlunos().add(aluno1);
        escola.getSala().get(indiceSalaOrigem1).getAlunos().remove(aluno1);
        escola.getSala().get(indiceSalaOrigem1).getAlunos().add(aluno2);
        escola.getSala().get(indiceSalaOrigem2).getAlunos().remove(aluno2);
    }
}
