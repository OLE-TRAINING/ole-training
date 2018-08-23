package exercicio11;

import java.util.Scanner;

public class SalarioProporcional {
	
	public static double calcularSalario(int numeroDiasTrabalhado, double salarioIntegral) {
		
		double coeficienteSalarial = numeroDiasTrabalhado/22.0;
		double salarioProporcional = salarioIntegral * coeficienteSalarial;
		
		return salarioProporcional;
	}
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int numeroDiasTrabalhado = 0;
		double salarioIntegral = 0;
		
		System.out.print("Digite a quantidade de dias trabalhados no m�s: ");
		numeroDiasTrabalhado = s.nextInt();
		
		System.out.print("Digite o sal�rio integral: ");
		salarioIntegral = s.nextDouble();
		
		double resultado = calcularSalario(numeroDiasTrabalhado, salarioIntegral);
		System.out.println("Sal�rio proporcional: " + resultado);	
		
		s.close();
	}

}
