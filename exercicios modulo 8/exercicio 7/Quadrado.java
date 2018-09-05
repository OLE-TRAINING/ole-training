public class Quadrado extends Quadrilatero {
	public Quadrado(int lado) {
		if (lado <= 0) {
			throw new IllegalArgumentException("Era esperado um valor maior que 0:" + lado);
		} else {
			setValorUm(lado);
			setValorDois(lado);
		}
	}

	public float calcularArea() {
		return getValorUm() * getValorUm();
	}

	public float calcularPerimetro() {
		return getValorUm() * 4;
	}

	public Quadrado verifica(int lado) {

		return new Quadrado(lado);
	}
}
