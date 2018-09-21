package ExerciciosChapter4;
import java.util.Scanner;

public class Conta {
    private Pessoa pe [] = new Pessoa[20];
    private Endereco end [] = new Endereco[20];
    private String numeroConta = "";
    private double saldo = 0.0;
    private double limite = 0.0;

    public Conta(String numeroConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Pessoa[] getPe() {
        return pe;
    }

    public void setPe(Pessoa[] pe) {
        this.pe = pe;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar (double dep){
        this.saldo = this.saldo + dep;
    }

    public boolean sacar (double sac) {
        if (this.saldo >= sac) {
            this.saldo = this.saldo - sac;
            return true;
        }
        System.out.println("Saldo Insuficiente!");
        return false;
    }

    public void cadastrarCliente(Conta cc []){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<cc.length; i++){
            pe [i] = new Pessoa();
            end[i] = new Endereco();
            System.out.println("CADASTRO "+i);
            System.out.println("Nome: ");
            pe[i].setNome(sc.nextLine());
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

    public void verCadastro(Conta cc[], int posicao){
        System.out.println("");
        System.out.println("---------CADASTRO CLIENTE---------");
        System.out.println("Nome: " + cc[posicao].getPe()[posicao].getNome());
        System.out.println("Idade: " + cc[posicao].getPe()[posicao].getIdade());
        System.out.println("CPF: " + cc[posicao].getPe()[posicao].getCPF());
        System.out.println("Telefone: " + cc[posicao].getPe()[posicao].getEnd().getTelefone());
        System.out.println("Rua: " + cc[posicao].getPe()[posicao].getEnd().getRua());
        System.out.println("CEP: " + cc[posicao].getPe()[posicao].getEnd().getCep());
        System.out.println("Bairro: " + cc[posicao].getPe()[posicao].getEnd().getBairro());
        System.out.println("Cidade: " + cc[posicao].getPe()[posicao].getEnd().getCidade());
        System.out.println("Estado: " + cc[posicao].getPe()[posicao].getEnd().getEstado());
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
    }

    public void verSaldo(Conta cc[], int posicao){
        System.out.println("");
        System.out.println("---------SALDO CLIENTE---------");
        System.out.println("Nome: " + cc[posicao].getPe()[posicao].getNome());
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Saldo: " + this.getSaldo());
    }
}