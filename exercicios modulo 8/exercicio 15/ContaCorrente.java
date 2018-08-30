
public abstract class ContaCorrente {
	private float saldoTotal=0;
	private float chequeEspecial=0;
	
	public ContaCorrente(float valorSaldo,float valorCheque) {
		this.saldoTotal=valorSaldo;
		this.chequeEspecial=valorCheque;
	}
	//getters
	public float getSaldoTotal() {
		return saldoTotal;
	}
	
	public float getChequeEspecial() {
		return chequeEspecial;
	}
	
	//setters 
	public void setSaldoEspecial(float saldo) {
		this.saldoTotal=saldo;
	}
	
	public void setChequeEspecial(float valor) {
		this.chequeEspecial=valor;
	}
	public void sacar(float valor){
		this.saldoTotal=saldoTotal-valor;
	}
	
	public void depositar(float valor){
		this.saldoTotal=saldoTotal+valor;
	}
	
	public void sacarChequeEspecial(float valor) {
		this.chequeEspecial=chequeEspecial-valor;
	}
	
	public void depositarChequeEspecial(float valor) {
		this.chequeEspecial=chequeEspecial+valor;
	}
	
	public float obterSaldo() {
		return this.saldoTotal;
	}
}
