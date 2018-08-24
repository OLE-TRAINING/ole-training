package exercicio14;

import java.util.Scanner;

public class ProgressaoAritmetica {
	
	public static void main(String[] args) {

		int numeros[] = leCarregaVetor();
		
		boolean ehProgressao = ehProgressaoAritmetica(numeros);	
			
		if(ehProgressao) {
			System.out.println("É progressão aritmética");
		}
		
		else {
			System.out.println("Não é progressão aritmética");	
		}
	}
	
	public static int[] leCarregaVetor() {
		
		Scanner s = new Scanner(System.in);
		int numeros[] = new int[10];
		
		System.out.print("Digite 10 números: ");
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = s.nextInt();
		}
		
		s.close();
		return numeros;
	}
	
	public static boolean ehProgressaoAritmetica(int numeros[]) {
		
		int diferencaEntreNumeros = numeros[1] - numeros[0];
		
		for(int i = 2; i < 10; i++) {
			if(numeros[i] - numeros[i-1] != diferencaEntreNumeros) {
				return false;
			}
		}
		
		return true;	
	}
}
