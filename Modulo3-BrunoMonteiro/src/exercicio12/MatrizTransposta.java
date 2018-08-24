package exercicio12;

import java.util.Scanner;

public class MatrizTransposta {

	public static void main(String[] args) {

		int matriz[][] = leRetornaMatriz();
		mostraTransposta(matriz);
	}
	
	public static int[][] leRetornaMatriz() {

		int matriz[][] = new int[4][4];
		
		System.out.println("Digite uma matriz 4x4:");
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = s.nextInt();
			}
		}
		
		s.close();
		return matriz;
	}
	
	public static void mostraTransposta(int matriz[][]) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println();
		}
	}
}
