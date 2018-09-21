package ExerciciosChapter4;

import java.util.Scanner;

public class Cadastro {

    private Pessoa pe [] = new Pessoa[100];
    private Endereco end [] = new Endereco[100];

    public Pessoa[] getPe() {
        return pe;
    }

    public void setPe(Pessoa[] pe) {
        this.pe = pe;
    }

    public Endereco[] getEnd() {
        return end;
    }

    public void setEnd(Endereco[] end) {
        this.end = end;
    }

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<pe.length; i++){
            pe [i] = new Pessoa();
            end[i] = new Endereco();
            System.out.println("CADASTRO "+i);
            System.out.println("Nome: ");
            this.pe[i].setNome(sc.nextLine());
            sc.nextLine();
            System.out.println("Idade: ");
            this.pe[i].setIdade(sc.nextInt());
            sc.nextLine();
            System.out.println("CPF: ");
            this.pe[i].setCPF(sc.nextLine());
            sc.nextLine();
            System.out.println("Telefone: ");
            this.pe[i].getEnd().setTelefone(sc.nextLine());
            sc.nextLine();
            System.out.println("ENDEREÇO:");
            System.out.println("Rua e Número da Casa: ");
            this.pe[i].getEnd().setRua(sc.nextLine());
            sc.nextLine();
            System.out.println("Bairro: ");
            this.pe[i].getEnd().setBairro(sc.nextLine());
            sc.nextLine();
            System.out.println("CEP: ");
            this.pe[i].getEnd().setCep(sc.nextLine());
            sc.nextLine();
            System.out.println("Cidade: ");
            this.pe[i].getEnd().setCidade(sc.nextLine());
            sc.nextLine();
            System.out.println("Estado: ");
            this.pe[i].getEnd().setEstado(sc.nextLine());
            sc.nextLine();
        }
    }


    public void apagarCadastro(Cadastro[] cad, int posicao){
        cad[posicao] = null;
        System.out.println("Cadastro Apagado com Sucesso!");
    }
}