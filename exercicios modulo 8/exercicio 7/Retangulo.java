public class Retangulo extends Quadrilatero {
	public Retangulo(int valorUm, int valorDois) {
		if (valorUm <= 0 || valorDois <= 0) {
			throw new IllegalArgumentException(
					"Nao � permitidos valores negativos\nvaloresentrados:\n" + valorUm + "\n" + valorDois);
		} else if (valorUm == valorDois) {
			throw new IllegalArgumentException(
					"Valor inv�lidomodifique um dos valores a fim de torn�-los diferentes\nvaloresentrados:\n" + valorUm
							+ "\n" + valorDois);
		} else {
			setValorUm(valorUm);
			setValorDois(valorDois);
		}
	}

	public float calcularArea() {
		return getValorUm() * getValorDois();
	}

	public float calcularPerimetro() {
		return (getValorUm() * 2) + (getValorDois() * 2);
	}
}
