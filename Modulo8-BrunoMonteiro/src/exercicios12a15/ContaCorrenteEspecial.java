package exercicios12a15;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double limiteDefinido;
	private double limiteCorrente;
	
	public ContaCorrenteEspecial(double saldoTotal, double limiteExtra) {
		super(saldoTotal);
		this.limiteDefinido = limiteExtra;
		this.limiteCorrente = limiteExtra;
	}

	public double getLimiteDefinido() {
		return limiteDefinido;
	}

	public void setLimiteDefinido(double limiteDefinido) {
		this.limiteDefinido = limiteDefinido;
	}

	public double getLimiteCorrente() {
		return limiteCorrente;
	}

	public void setLimiteCorrente(double limiteCorrente) {
		this.limiteCorrente = limiteCorrente;
	}

	public void sacar(double valor) {
		try {
			super.sacar(valor);
		} catch (IllegalArgumentException e) {
			if (valor > getSaldoTotal() + getLimiteCorrente()) {
				throw new IllegalArgumentException("Valor pedido excede saldo e limite extra!");
			} else {
				this.limiteCorrente += (getSaldoTotal() - valor);
				setSaldoTotal(0);
			}
		}
	}
	
	public void depositar(double valor) {
		if (this.limiteCorrente < this.limiteDefinido) {
			this.limiteCorrente += valor;
			
			if (getLimiteCorrente() > getLimiteDefinido()) {
				valor = this.limiteCorrente - this.limiteDefinido;
				this.limiteCorrente = this.limiteDefinido;
				super.depositar(valor);
			}
		}
	}
}
