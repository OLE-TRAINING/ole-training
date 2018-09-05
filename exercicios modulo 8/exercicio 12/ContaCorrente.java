public abstract class ContaCorrente {
	private float saldoTotal = 0;

	public void sacar(float valor) {
		this.saldoTotal = saldoTotal - valor;
	}

	public void depositar(float valor) {
		this.saldoTotal = saldoTotal + valor;
	}

	public float obterSaldo() {
		return this.saldoTotal;
	}
}
