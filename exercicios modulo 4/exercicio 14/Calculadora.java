
public class Calculadora {

	public static void main(String[] args) {
		String teste1 = "123";
		String teste2 = "12";

		Double valor1 = Double.parseDouble(teste1);
		Double valor2 = Double.parseDouble(teste2);
		/*
		 * codigo alternativo caso utiliza�ao de parametros:
		 * Double valor1 =Double.parseDouble(args[0]); 
		 * Double valor2 =Double.parseDouble(args[1]);
		 * 
		 * if(args.length != 2) { 
		 * System.out.println("Est� errado a quantidade de elemenstos passados... o programa ser� encerrado!!"); 
		 * System.exit(1); 
		 * }
		 */
		Soma opera�aoSoma = new Soma();
		Subtra�ao opera�aoSubtrair = new Subtra�ao();
		Multiplica�ao opera�aoMultiplicar = new Multiplica�ao();
		Divisao opera�aoDividir = new Divisao();

		Double opera�ao = opera�aoSoma.somar(valor1, valor2);
		System.out.println("Soma =" + opera�ao);

		opera�ao = opera�aoSubtrair.subtrair(valor1, valor2);
		System.out.println("Subtra�ao =" + opera�ao);

		opera�ao = opera�aoMultiplicar.multiplicar(valor1, valor2);
		System.out.println("Multiplica�ao =" + opera�ao);

		opera�ao = opera�aoDividir.dividir(valor1, valor2);
		System.out.println("Divisao =" + opera�ao);

	}

}
