package exercicio14e15;

public class ContaCorrente {

	private String agencia;
	private int numero;
	private String nome;
	private String cpf;
	private double saldo;
	
	public ContaCorrente(String agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public boolean equals(Object obj) {
		if ((obj instanceof ContaCorrente) && ((ContaCorrente)obj).agencia.equals(this.agencia) 
				&& ((ContaCorrente)obj).numero == this.numero) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.numero;
	}
}
