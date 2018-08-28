package exercicio14e15;

public class Calculadora {

	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public Double fazerOperacao(double valor1, double valor2, char op) {
		switch (op) {
		case '+':
			return somar(valor1, valor2);
		case '-':
			return subtrair(valor1, valor2);
		case '*':
			return multiplicar(valor1, valor2);
		case '/':
			return dividir(valor1, valor2);
		}
		return null;
	}
}
