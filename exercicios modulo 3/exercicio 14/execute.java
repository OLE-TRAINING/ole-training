import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vetInt[] = new int[10];
		int soma = 0;
		int progre�ao = 0;

		for (int i = 0; i < 10; i++) {
			vetInt[i] = s.nextInt();
			soma += vetInt[i];
		}

		// utilizando a formula da soma dos elementos
		// de uma progressao aritmetca:
		progre�ao = ((vetInt[0] + vetInt[9]) * 10) / 2;

		if (soma == progre�ao) {
			System.out.println("progre�ao aritmetica");
		} else {
			System.out.println("nao � progre�ao aritmetica");
		}

	}

}
