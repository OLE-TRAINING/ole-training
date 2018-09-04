import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Digite um numero entre -9999 e 9999:");
			numero = s.nextInt();
		} while (numero < -9999 || numero > 9999);

		
		System.out.println("Numero=" + inverte(numero));
	}

	public static int inverte(int numero) {
		if (numero < 0) {
			numero *= -1;
			numero = inverteAuxiliar(numero);
			numero *= -1;
		} else {
			numero = inverteAuxiliar(numero);
		}
		return numero;
	}

	public static int inverteAuxiliar(int numero) {

		int auxiliar = 0;
		for (; numero >= 1;) {
			auxiliar += numero % 10;
			if (numero > 9) {
				auxiliar *= 10;
			}
			numero = numero / 10;
		}
		return auxiliar;
	}

}