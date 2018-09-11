package exercicios12a15;

public abstract class ContaCorrente {

	private double saldoTotal;
	
	public ContaCorrente(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void sacar(double valor) {
		if(valor > saldoTotal) {
			throw new IllegalArgumentException("Valor pedido é maior que o saldo!");
		} else {
			this.saldoTotal -= valor;
		}
	}
	
	public void depositar(double valor) {
		this.saldoTotal += valor;
	}
}
