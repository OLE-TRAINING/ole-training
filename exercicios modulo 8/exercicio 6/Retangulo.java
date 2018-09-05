public class Retangulo extends Quadrilatero {
	public Retangulo(int valorUm, int valorDois) {
		super(valorUm, valorDois);
	}

	public float calcularArea() {
		return getValorUm() * getValorDois();
	}

	public float calcularPerimetro() {
		return (getValorUm() * 2) + (getValorDois() * 2);
	}
}
