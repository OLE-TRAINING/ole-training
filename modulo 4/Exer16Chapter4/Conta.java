package Exer16Chapter4;

import Exer13Chapter4.Person;

public class Conta extends Person {

    private String numeroConta;
    private double saldo;
    private double limite;

    public Conta(String numeroConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
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

    public boolean sacar(double valorSaque){
        if (valorSaque>getSaldo()){
            System.out.println("Saldo Insuficiente!");
            return false;
        } else {
            return true;
        }
    }

    public void depositar (double valorDeposito){
        setSaldo(getSaldo()+valorDeposito);
    }

    public double saldo (){
        return getSaldo();
    }
}