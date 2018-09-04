import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();

		if (valor < 0) {
			valor *= -1;
			ehPrimo(valor);
		} else {
			ehPrimo(valor);
		}

	}

	public static void ehPrimo(int valor) {
		Boolean flag = false;
		for (int numero = 2; numero < valor; numero++) {
			if (valor % numero == 0) {
				System.out.print("Divisivel por:" + numero);
				flag = true;
				break;
			}
		}

		if (flag || valor == 0)
			System.out.println(" portanto NAO eh PRIMO");
		else {
			System.out.println("eh PRIMO");
		}
	}
}