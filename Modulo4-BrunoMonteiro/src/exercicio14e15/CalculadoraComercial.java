package exercicio14e15;

public class CalculadoraComercial {

	private Calculadora calculadora;

	public CalculadoraComercial() {
		calculadora = new Calculadora();
	}

	public double porcentagem(double valorTotal, int porcentagemASerObtida) {
		return valorTotal * (porcentagemASerObtida / 100.0);
	}

	public Double fazerOperacao(double valor1, double valor2, char op) {
		Double resultadoCalculadoraSimples = calculadora.fazerOperacao(valor1, valor2, op);

		if (resultadoCalculadoraSimples != null) {
			return resultadoCalculadoraSimples;
		} else {
			if (op == '%') {
				return porcentagem(valor1, (int) valor2);
			}
			return null;
		}
	}
}
