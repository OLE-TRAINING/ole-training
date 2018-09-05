public abstract class Quadrilatero implements FiguraGeometrica {
	private int valorUm;
	private int valorDois;
	private int valorTres;
	private int valorQuatro;

	public Quadrilatero(int lado) {
		this.valorUm = lado;
		this.valorDois = lado;
		this.valorTres = lado;
		this.valorQuatro = lado;
	}

	public Quadrilatero(int lado, int lado2) {
		this.valorUm = lado;
		this.valorDois = lado;
		this.valorTres = lado2;
		this.valorQuatro = lado2;
	}

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

	public float calcularArea(int lado) {
		return lado * lado;
	}

	public float calcularArea(int lado, int ladoDois) {
		return lado * ladoDois;
	}

	public float calcularPerimetro(int lado) {
		return lado * 4;
	}

	public float calcularPerimetro(int lado, int lado1) {
		return (lado * 2) + (lado1 * 2);
	}
}
