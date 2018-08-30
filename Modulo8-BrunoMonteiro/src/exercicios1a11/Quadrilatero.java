package exercicios1a11;

public abstract class Quadrilatero implements FiguraGeometrica {

	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	
	public Quadrilatero() {
		super(); // apenas para não deixar em branco
	}

	public Quadrilatero(int lado1, int lado2, int lado3, int lado4) {
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
		setLado4(lado4);
	}
	
	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public int getLado4() {
		return lado4;
	}

	public void setLado4(int lado4) {
		this.lado4 = lado4;
	}
}