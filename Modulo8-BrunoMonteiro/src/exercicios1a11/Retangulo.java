package exercicios1a11;

public class Retangulo extends Quadrilatero {

	public Retangulo(int base, int altura) {
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("Valor inv�lido, os valores esperados s�o maior que 0."); 
		} else if (base == altura) {
			throw new IllegalArgumentException("Valor inv�lido, modifique um dos valores a fim de torn�-los diferente."); 
		} else {
			setLado1(base);
			setLado2(base);
			setLado3(altura);
			setLado4(altura);
		}
	}

	@Override
	public double calcularArea() {
		return getLado1() * getLado3();
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (getLado1() + getLado3());
	}
}