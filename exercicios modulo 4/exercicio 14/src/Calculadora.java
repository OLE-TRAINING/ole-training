
public class Calculadora {

	public static void main(String[] args) {
		String teste1 = "123";
		String teste2 = "12";

		Double valor1 = Double.parseDouble(teste1);
		Double valor2 = Double.parseDouble(teste2);
		// Double valor1 =Double.parseDouble(args[0]);
		// Double valor2 =Double.parseDouble(args[1]);

		Soma operašaoSoma = new Soma();
		Subtrašao operašaoSubtrair = new Subtrašao();
		Multiplicašao operašaoMultiplicar = new Multiplicašao();
		Divisao operašaoDividir = new Divisao();

		Double operašao = operašaoSoma.somar(valor1, valor2);
		System.out.println("Soma =" + operašao);

		operašao = operašaoSubtrair.subtrair(valor1, valor2);
		System.out.println("Subtrašao =" + operašao);

		operašao = operašaoMultiplicar.multiplicar(valor1, valor2);
		System.out.println("Multiplicašao =" + operašao);

		operašao = operašaoDividir.dividir(valor1, valor2);
		System.out.println("Divisao =" + operašao);

	}

}
