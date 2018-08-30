public class Quadrado extends Quadrilatero{
	
	public Quadrado(int lado) {
		super(lado);
	}
	
	public float calcularArea() {
		return getValorUm()*getValorUm();
	}
	
	public float calcularPerimetro() {
		return getValorUm()*4;
	}

}
