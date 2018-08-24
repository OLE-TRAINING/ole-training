package exercicio9;

import java.util.Scanner;

public class InverteNum {
	
	public static int inverteNumero(int numero) {
		
		int sinal = (numero < 0)? -1 : 1; // se é negativo, sinal = -1; caso contrário = 1
		
		if(numero < 0)
			numero *= -1; // transforma numero em positivo para fazer a conversão certa

		String numeroComoString = Integer.toString(numero); // converte para String(mais fácil de manipular)
		String numeroInvertidoString = "";
		
		for(int i = numeroComoString.length()-1; i >= 0; i--) 
			numeroInvertidoString += numeroComoString.charAt(i);
		
		int numeroInvertido = (Integer.parseInt(numeroInvertidoString)) * sinal;
		return numeroInvertido;
	}
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numero; 
		
		do {
			System.out.print("Digite um número de até 4 dígitos: ");
			numero = s.nextInt();
		} 
		while(numero > 9999 || numero < -9999);
		
		System.out.println(inverteNumero(numero));
		
		s.close();
	}
}
