import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int valor;
		float salario;

		do {
			System.out.println("Digite a quantidade de dias trabalhados e o salario:");
			valor = s.nextInt();
			salario = s.nextFloat();
		} while (verificaEntrada(valor, salario));

		System.out.println("Salario Proporcional:" + calculaSalarioProporcional(valor, salario));
	}

	public static float calculaSalarioProporcional(int valor, float salario) {
		return ((float) valor / 22) * salario;
	}

	public static boolean verificaEntrada(int valor, float salario) {
		if (valor <= 0 || salario <= 0) {
			System.out.println("Valores Invalidos.. verifique os valores de salario e dias!!!!");
			return true;
		}
		return false;
	}

}
