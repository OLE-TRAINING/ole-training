public class Execute {

	public static void main(String[] args) {
		int somaImpares = 0;
		float multiplica�aoPares = 1;
		// numeros 1 e 30 nao considerados
		for (int number = 2; number < 30; number++) {
			if (number % 2 != 0) {
				somaImpares += number;
			} else {
				multiplica�aoPares *= number;
			}
		}
		System.out.println("Soma dos Impares:" + somaImpares + "\nMultiplica�ao dos pares:" + multiplica�aoPares);
	}
}