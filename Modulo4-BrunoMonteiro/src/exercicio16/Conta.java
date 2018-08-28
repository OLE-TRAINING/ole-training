package exercicio16;

import exercicios7e8e11e12.Pessoa;

public class Conta {
	
	private Pessoa cliente;
	private int numeroConta;
	private double saldo;
	private double limite;
	
	public Conta(Pessoa cliente, int numeroConta, double saldo, double limite) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public boolean sacar(double valoraSerSacado) {
		if (valoraSerSacado > saldo) {
			System.out.println("Valor maior que o saldo!");
			return false;
		} else {
			saldo -= valoraSerSacado;
			System.out.println("Valor sacado: " + valoraSerSacado);
			return true;
		}
	}
	
	public void depositar(double valorASerDepositado) {
		saldo += valorASerDepositado;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
