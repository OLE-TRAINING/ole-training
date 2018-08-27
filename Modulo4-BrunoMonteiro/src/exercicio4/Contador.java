package exercicio4;

public class Contador {

	private int valor;
	private int valorInicial;
	
	public Contador(int valor) {
		this.valor = valor;
		this.valorInicial = valor;
	}
	
	public int informarValorAtual() {
		return this.valor;
	}
	
	public void incrementar() {
		this.valor++;
	}
	
	public void decrementar() {
		this.valor--;
	}
	
	public void imprimeValorInicial() {
		System.out.println("Valor inicial: " + valorInicial);
	}
	
}
