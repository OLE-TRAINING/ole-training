package exercicio2e3e10e11e12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class InserindoStrings {

	public static void main(String[] args) {
		// Exerc�cio 2
		System.out.println("Para ArrayList...");
		ArrayList<String> strings = new ArrayList<String>();
		insereStringsCollection(strings);
		imprimeTamanhoCollection(strings);
		imprimirCollectionString(strings);

		// Exerc�cio 3
		System.out.println("\nPara HashSet...");
		HashSet<String> stringsHash = new HashSet<String>();
		insereStringsCollection(stringsHash);
		imprimeTamanhoCollection(stringsHash);
		imprimirCollectionString(stringsHash);
		
		// Exerc�cio 10
		desordenarImprimirList(strings);
		System.out.println(strings);
		
		// Exerc�cio 11
		System.out.println("String2 na posi��o " + (pesquisarCollection(strings, "String2")));
		
		// Exerc�cio 12
		ordenarImprimirList(strings);
		System.out.println(strings);
	}
	
	public static void insereStringsCollection(Collection<String> strings) {
		strings.add("String1");
		strings.add("String1");
		strings.add("String2");
		strings.add("String2");
		strings.add("String3");
		strings.add("String3");
	}
	
	public static void imprimeTamanhoCollection(Collection<String> strings) {
		System.out.println("Tamanho da Collection: " + strings.size());
	}
	
	public static void imprimirCollectionString(Collection<String> strings) {
		for (String str : strings) {
			System.out.println(str);
		}
	}

	// Exerc�cio 10
	public static void desordenarImprimirList(List<String> lista) {
		Collections.shuffle(lista);
	}
	
	// Exerc�cio 11
	public static int pesquisarCollection(List<String> lista, String stringAProcurar) {
		return Collections.binarySearch(lista, stringAProcurar);
	}
	
	// Exerc�cio 12
	public static void ordenarImprimirList(List<String> lista) {
		Collections.sort(lista);
	}
}
