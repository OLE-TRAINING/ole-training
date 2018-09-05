public class ContaCorrente {
	private int agencia;
	private int numero;
	private String nome;
	private String cpf;
	private float saldo;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean equals(Object obj) {
		if ((obj instanceof ContaCorrente) && ((ContaCorrente) obj).getAgencia() == this.getAgencia()
				&& ((ContaCorrente) obj).getNumero() == this.getNumero()) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return agencia + numero;
	}
}
