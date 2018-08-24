package exercicio16;

import java.util.Scanner;

public class OrdenarVetor {
	
	public static void main(String[] args) {

		int numeros[] = leRetornaVetor();
		int vetorOrdenado[] = ordenarVetor(numeros);
		imprimeVetor(vetorOrdenado);
	}
	
	public static int[] leRetornaVetor() {
		
		Scanner s = new Scanner(System.in);
		int numeros[] = new int[5];
		
		System.out.print("Digite 5 n�meros: ");
		
		for (int i = 0; i < 5; i++) {
			numeros[i] = s.nextInt();
		}
		
		s.close();
		return numeros;
	} 
	
	public static int[] ordenarVetor(int numeros[]) {
		
		int vetorResultante[] = new int[5];
		int iteradorResultante = 0;
		int temp;
		int indiceMaior;
		
		for (int i = 0; i < 5; i++) {
		
			indiceMaior = retornaPosicaoDoMaior(numeros, i);
			
			vetorResultante[iteradorResultante] = numeros[indiceMaior];
			iteradorResultante++;	
			
			// coloca sempre na posi��o corrente(i) para n�o percorre-lo na proxima itera��o
			temp = numeros[indiceMaior];
			numeros[indiceMaior] = numeros[i];
			numeros[i] = temp;
		}
		
		return vetorResultante;
	}
	
	public static int retornaPosicaoDoMaior(int numeros[], int posicaoCorrente) {

		int indiceMaior = posicaoCorrente;
		
		for (int j = posicaoCorrente+1; j < 5; j++) {
			if (numeros[j] > numeros[indiceMaior]) {
				indiceMaior = j;
			}
		}
		
		return indiceMaior;
	}
	
	public static void imprimeVetor(int numeros[]) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
	}
}
