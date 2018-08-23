package exercicio7;

public class SomaEMultiplicacao {

	public static void main(String[] args) {

		int impar = 1;
		int par = 2;
		
		int somaImpares = 0;
		long multiplicacaoPares = 1; // int causa overflow (32 bits não é o suficiente)
		
		while(par <= 30) {
			somaImpares += impar;
			multiplicacaoPares *= par;
			
			impar += 2;
			par += 2;
		}
		
		System.out.println("Soma dos ímpares: " + somaImpares);
		System.out.println("Multiplicação dos pares: " + multiplicacaoPares);

	}

}
