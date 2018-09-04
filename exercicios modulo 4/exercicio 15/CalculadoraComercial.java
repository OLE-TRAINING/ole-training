
public class CalculadoraComercial {

	public static void main(String[] args) {
	   Calculadora calculadora = new Calculadora();
	   Porcentagem operaçaoPorcentagem = new Porcentagem();
	   
	   double valor1=100,valor2=200;
	   
	   System.out.println("Divisao:"+calculadora.operaçaoDividir.dividir(valor1, valor2));
	   System.out.println("Multiplicaçao:"+calculadora.operaçaoMultiplicar.multiplicar(valor1, valor2));
	   System.out.println("Soma:"+calculadora.operaçaoSomar.somar(valor1, valor2));
	   System.out.println("Subtraçao:"+calculadora.operaçaoSubtrair.subtrair(valor1, valor2));
	   
	   System.out.println("Porcentagem:"+operaçaoPorcentagem.porcentagem(valor1,(int)valor2));
	   
	}

}
