package exercicios12a15;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double limiteDefinido;
	private double limiteCorrente;
	
	public ContaCorrenteEspecial(double saldoTotal, double limiteExtra) {
		super(saldoTotal);
		setLimiteDefinido(limiteExtra);
		setLimiteCorrente(limiteExtra);
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
				setLimiteCorrente(getLimiteCorrente() + (getSaldoTotal() - valor));
				setSaldoTotal(0);
			}
		}
	}
	
	public void depositar(double valor) {
		if (getLimiteCorrente() < getLimiteDefinido()) {
			setLimiteCorrente(getLimiteCorrente() + valor);
			
			if (getLimiteCorrente() > getLimiteDefinido()) {
				valor = getLimiteCorrente() - getLimiteDefinido();
				setLimiteCorrente(getLimiteDefinido());
				super.depositar(valor);
			}
		}
	}
}
