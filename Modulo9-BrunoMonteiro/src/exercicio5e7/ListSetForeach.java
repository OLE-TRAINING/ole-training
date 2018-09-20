package exercicio5e7;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ListSetForeach {

	public static void main(String[] args) {
		// Exercício 5
		List<Integer> listaNum = new Vector<Integer>();
		insereNumerosCollection(listaNum);
		percorrerListImprimirMedia(listaNum);
		
		// Exercício 7
		Set<Integer> setNum = new HashSet<Integer>();
		insereNumerosCollection(setNum);
		percorrerListImprimirMedia(setNum);
	}
	
	public static void percorrerListImprimirMedia(Collection<Integer> colecao) {
		double media = 0;
		for (Integer i : colecao) {
			media += i;
		}
		System.out.println("Media: " + (media / 8.0));
	}
	
	public static void insereNumerosCollection(Collection<Integer> colecao) {
		colecao.add(100);
		colecao.add(20);
		colecao.add(200);
		colecao.add(30);
		colecao.add(80);
		colecao.add(40);
		colecao.add(100);
		colecao.add(200);
	}
}
