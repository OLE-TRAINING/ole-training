import javax.swing.JOptionPane;

public class Quadrado extends Quadrilatero {
	public Quadrado(int lado) {
		quadradoVerificaEseta(lado, lado);
	}

	// construtor com 2 parametros
	public Quadrado(int lado, int lado2) {
		quadradoVerificaEseta(lado, lado2);
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

	private void quadradoVerificaEseta(int lado, int lado2) {
		String mensagem = "aaa";
		try {
			if (lado <= 0 || lado2 <= 0) {
				mensagem = "Era esperado um valor maior que 0";
				throw new IllegalArgumentException();
			} else if (lado != lado2) {
				mensagem = "os valores nao corespondem a um quadrado";
				throw new IllegalArgumentException();
			} else {
				setValorUm(lado);
				setValorDois(lado2);
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, mensagem);
			System.exit(1);
		}
	}
}
