
public abstract class Quadrilatero {
	private int valorUm;
	private int valorDois;
	private int valorTres;
	private int valorQuatro;
	
	public Quadrilatero(int lado1,int lado2, int lado3, int lado4) {
		this.valorUm=lado1;
	    this.valorDois=lado2;
	    this.valorTres=lado3;
	    this.valorQuatro=lado4;	
	}
	
	//getters
	public int getValorUm() {
		return this.valorUm;
	}
	
	public int getValorDois() {
		return this.valorDois;
	}
	
	public int getValorTres() {
		return this.valorTres;
	}
	
	public int getValorQuatro() {
		return this.valorQuatro;
	}
	
	//setters
    //considerei nao haver necessidade devido ao construtor
}
