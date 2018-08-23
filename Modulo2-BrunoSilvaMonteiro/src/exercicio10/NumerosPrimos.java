package exercicio10;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static boolean ehPrimo(int numero) {
		
		boolean naoPossuiOutrosDivisores = true;
		
		for(int i = 2; i < numero; i++) 
			if(numero % i == 0) {
				naoPossuiOutrosDivisores = false;
				break;
			}
		
		return naoPossuiOutrosDivisores;
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = s.nextInt();
		
		if(ehPrimo(numero))
			System.out.println("É primo");
		
		else
			System.out.println("Não é primo");
		
		s.close();
		
	}

}
