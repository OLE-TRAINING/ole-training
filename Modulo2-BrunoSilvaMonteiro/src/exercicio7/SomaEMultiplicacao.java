package exercicio7;

public class SomaEMultiplicacao {

	public static void main(String[] args) {

		int impar = 1;
		int par = 2;
		
		int somaImpares = 0;
		long multiplicacaoPares = 1; // int causa overflow (32 bits n�o � o suficiente)
		
		for(int i = 0; i < 15; i++) {
			somaImpares += impar;
			multiplicacaoPares *= par;
			
			impar += 2;
			par += 2;
		}
		
		System.out.println("Soma dos �mpares: " + somaImpares);
		System.out.println("Multiplica��o dos pares: " + multiplicacaoPares);

	}

}
