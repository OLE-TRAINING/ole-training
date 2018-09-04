import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int height;
		int baseA;
		int baseB;

		System.out.println("Vamos calcular a Area de um Trapezio:");
		do {
			System.out.println("Digite a altura(h)( é aceito apenas valor positivo) do trapezio:");
			height = s.nextInt();
		} while (height <= 0);

		do {
			System.out.println("Digite base menor( é aceito apenas valor positivo) do trapezio:");
			baseA = s.nextInt();
		} while (baseA <= 0);

		do {
			System.out.println("Digite a base maior( é aceito apenas valor positivo) do trapezio:");
			baseB = s.nextInt();
		} while (baseB <= 0);

		System.out.println("Area=" + calcArea(height, baseA, baseB));
	}

	public static float calcArea(int height, int baseA, int baseB) {
		return ((float) (height * (baseA + baseB))) / 2;
	}

}