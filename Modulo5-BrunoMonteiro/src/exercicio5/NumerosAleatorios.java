package exercicio5;

public class NumerosAleatorios {
	
	public static void main(String[] args) {
		int numAleatorio1 = gerarNumeroAleatorio();
		int numAleatorio2 = gerarNumeroAleatorio();
		
		System.out.println("Numeros gerados: " + numAleatorio1 + " e " + numAleatorio2);
		System.out.println("Maior: " + verificarMaior(numAleatorio1, numAleatorio2));
	}
	
	public static int gerarNumeroAleatorio() {
		return (int)(Math.random() * 1000);
	}
	
	public static int verificarMaior(int numero1, int numero2) {
		return Math.max(numero1, numero2);
	}
}
