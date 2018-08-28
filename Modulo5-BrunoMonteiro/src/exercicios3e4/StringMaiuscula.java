package exercicios3e4;

public class StringMaiuscula {

	public static void main(String[] args) {
		String str = "computado66r";
		StringComLetrasMaiusculas(str);
		contemNumeros(str);
	}

	public static void StringComLetrasMaiusculas(String str) {
		System.out.println(str.substring(0, 4).toUpperCase() + str.substring(4));
	}

	public static void contemNumeros(String str) {
		String numeros = "0123456789";
		for (int i = 0; i < numeros.length(); i++) {
			if (str.indexOf(numeros.charAt(i)) >= 0) {
				System.out.println("String possui números");
				break;
			}
		}
	}
}
