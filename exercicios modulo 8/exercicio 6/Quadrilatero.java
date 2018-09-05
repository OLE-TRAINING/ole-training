public abstract class Quadrilatero implements FiguraGeometrica {
	private int valorUm;
	private int valorDois;

	public Quadrilatero(int lado) {
		this.valorUm = lado;
		this.valorDois = lado;
	}

	public Quadrilatero(int lado, int lado2) {
		this.valorUm = lado;
		this.valorDois = lado2;
	}

	public int getValorUm() {
		return this.valorUm;
	}

	public int getValorDois() {
		return this.valorDois;
	}
}
