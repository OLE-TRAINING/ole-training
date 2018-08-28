package exercicio14e15;

public class TesteCalculadora {

	public static void main(String[] args) {
		CalculadoraComercial calculadora = new CalculadoraComercial();

		System.out.println(calculadora.fazerOperacao(20, 5, '*'));
		System.out.println(calculadora.fazerOperacao(50, 10, '%'));
	}
}
