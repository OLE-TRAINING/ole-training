package ExerciciosChapter4;

import java.util.Scanner;

public class Pessoa {

    private String Nome = "";
    private int idade = 0;
    private String CPF = "";
    private Endereco end = new Endereco();


    public Pessoa(String nome, int idade, String CPF) {
        Nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.setEnd(end);
    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Telefone: " + this.end.getTelefone());
        System.out.println("Rua: " + this.end.getRua());
        System.out.println("CEP: " + this.end.getCep());
        System.out.println("Bairro: " + this.end.getBairro());
        System.out.println("Cidade: " + this.end.getCidade());
        System.out.println("Estado: " + this.end.getEstado());
    }
}
