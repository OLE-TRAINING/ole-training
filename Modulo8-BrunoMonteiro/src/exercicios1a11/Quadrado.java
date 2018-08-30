package exercicios1a11;

public class Quadrado extends Quadrilatero {

	public Quadrado(int lado) {
		if (lado < 0) {
			throw new IllegalArgumentException("Valor inválido, os valores esperados são maior que 0.");
		} else {
			setLado1(lado);
			setLado2(lado);
			setLado3(lado);
			setLado4(lado);
		}
	}

	@Override
	public double calcularArea() {
		return getLado1() * getLado1();
	}

	@Override
	public double calcularPerimetro() {
		return getLado1() * 4;
	}
}