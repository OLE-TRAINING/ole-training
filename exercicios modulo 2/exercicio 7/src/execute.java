public class Execute {

	public static void main(String[] args) {
		int somaImpares = 0;
		float multiplicaçaoPares = 1;
		// numeros 1 e 30 nao considerados
		for (int number = 2; number < 30; number++) {
			if (number % 2 != 0) {
				somaImpares += number;
			} else {
				multiplicaçaoPares *= number;
			}
		}
		System.out.println("Soma dos Impares:" + somaImpares + "\nMultiplicaçao dos pares:" + multiplicaçaoPares);
	}
}