package exercicio9;

import java.util.Scanner;

public class InverteNum {
	
	public static int inverteNumero(int numero) {
		
		int sinal = (numero < 0)? -1 : 1; // se � negativo, sinal = -1; caso contr�rio = 1
		
		if(numero < 0)
			numero *= -1; // transforma numero em positivo para fazer a convers�o certa

		String numeroComoString = Integer.toString(numero); // converte para String(mais f�cil de manipular)
		String numeroInvertidoString = "";
		
		for(int i = numeroComoString.length()-1; i >= 0; i--) 
			numeroInvertidoString += numeroComoString.charAt(i);
		
		int numeroInvertido = (Integer.parseInt(numeroInvertidoString)) * sinal;
		return numeroInvertido;
	}
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numero; 
		
		System.out.print("Digite um inteiro de at� 4 n�meros: ");
		numero = s.nextInt();
		
		System.out.println(inverteNumero(numero));
		
		s.close();
	}
}
