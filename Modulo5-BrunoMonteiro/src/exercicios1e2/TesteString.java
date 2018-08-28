package exercicios1e2;

public class TesteString {
	
	public static void main(String [] args) {
		String str = "agora";
		
		verificaTamanhoString(str);
		verificaPrimeiraLetraString(str);
	}
	
	public static void verificaTamanhoString(String str) {
		if(str.length() < 8) {
			System.out.println("String com menos de 8 caracteres!");
		}
	}
	
	public static void verificaPrimeiraLetraString(String str) {
		if(str.charAt(0) != 'A') {
			System.out.println("String não começa com 'A'!");
		}
	}
}
