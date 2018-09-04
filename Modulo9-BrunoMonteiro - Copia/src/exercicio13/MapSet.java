package exercicio13;

import java.util.HashMap;
import java.util.HashSet;

public class MapSet {

	public static void main(String[] args) {
		HashMap<Integer, Aluno> hashmap = new HashMap<Integer, Aluno>();
		HashSet<Aluno> hashset = new HashSet<Aluno>();

		inserirAlunosHashMap(hashmap);
		inserirAlunosHashSet(hashset);
		
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 3000000; i++) { // fiz esse for porque só uma vez sempre é 0ms
			pesquisarAlunoHashMap(hashmap, 15000);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Pesquisa em map: " + (fim - inicio) + "ms");
		
		Aluno aluno = new Aluno(15000, "aaa", 5);
		inicio = System.currentTimeMillis();
		for (int i = 0; i < 3000000; i++) {
			pesquisarAlunoHashSet(hashset, aluno);
		}
		fim = System.currentTimeMillis();
		System.out.println("Pesquisa em set: " + (fim - inicio) + "ms");
	}
	
	// Exercício 13
	public static void inserirAlunosHashMap(HashMap<Integer, Aluno> hashmap) {
		for (int i = 0; i < 20000; i++) {
			hashmap.put(i, new Aluno(i, "aaa", 5));
		}
	}
	
	public static void inserirAlunosHashSet(HashSet<Aluno> hashset) {
		for (int i = 0; i < 20000; i++) {
			hashset.add(new Aluno(i, "aaa", 5));
		}
	}
	
	public static Aluno pesquisarAlunoHashMap(HashMap<Integer, Aluno> hashmap, int matricula) {
		return hashmap.get(matricula);
	}
	
	public static boolean pesquisarAlunoHashSet(HashSet<Aluno> hashset, Aluno aluno) {
		return hashset.contains(aluno);
	}
}
