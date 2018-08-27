
public class Calculadora {

	public static void main(String[] args) {
		String teste1 = "123";
		String teste2 = "12";

		Double valor1 = Double.parseDouble(teste1);
		Double valor2 = Double.parseDouble(teste2);
		// Double valor1 =Double.parseDouble(args[0]);
		// Double valor2 =Double.parseDouble(args[1]);

		Soma operaçaoSoma = new Soma();
		Subtraçao operaçaoSubtrair = new Subtraçao();
		Multiplicaçao operaçaoMultiplicar = new Multiplicaçao();
		Divisao operaçaoDividir = new Divisao();

		Double operaçao = operaçaoSoma.somar(valor1, valor2);
		System.out.println("Soma =" + operaçao);

		operaçao = operaçaoSubtrair.subtrair(valor1, valor2);
		System.out.println("Subtraçao =" + operaçao);

		operaçao = operaçaoMultiplicar.multiplicar(valor1, valor2);
		System.out.println("Multiplicaçao =" + operaçao);

		operaçao = operaçaoDividir.dividir(valor1, valor2);
		System.out.println("Divisao =" + operaçao);

	}

}
