
public class CalculadoraComercial {

	public static void main(String[] args) {
	   Calculadora calculadora = new Calculadora();
	   Porcentagem opera�aoPorcentagem = new Porcentagem();
	   
	   double valor1=100,valor2=200;
	   
	   System.out.println("Divisao:"+calculadora.opera�aoDividir.dividir(valor1, valor2));
	   System.out.println("Multiplica�ao:"+calculadora.opera�aoMultiplicar.multiplicar(valor1, valor2));
	   System.out.println("Soma:"+calculadora.opera�aoSomar.somar(valor1, valor2));
	   System.out.println("Subtra�ao:"+calculadora.opera�aoSubtrair.subtrair(valor1, valor2));
	   
	   System.out.println("Porcentagem:"+opera�aoPorcentagem.porcentagem(valor1,(int)valor2));
	   
	}

}
