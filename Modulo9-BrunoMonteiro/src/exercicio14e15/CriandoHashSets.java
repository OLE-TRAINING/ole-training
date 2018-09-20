package exercicio14e15;

import java.util.HashSet;

// Exercício 15
public class CriandoHashSets {

	public static void main(String[] args) {
		
		HashSet<ContaCorrente> hashset = new HashSet<ContaCorrente>();
		inserirContas(hashset);
		
		System.out.println(hashset);
	}
	
	public static void inserirContas(HashSet<ContaCorrente> hashsets) {
		hashsets.add(new ContaCorrente("C1", 0));
		hashsets.add(new ContaCorrente("C2", 1));
		hashsets.add(new ContaCorrente("C3", 2));
		hashsets.add(new ContaCorrente("C4", 3));
		hashsets.add(new ContaCorrente("C5", 4));
	}
}
