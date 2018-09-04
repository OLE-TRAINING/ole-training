package exercicio4;

import java.util.HashMap;
import java.util.Map;

public class InsereStringsMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		insereStringsMap(hashmap);
		imprimeStringsRepetidas(hashmap);
		imprimeTamanhoMap(hashmap);
	}
	
	public static void imprimeStringsRepetidas(Map<Integer, String> strings) {
		for (Map.Entry<Integer, String> str : strings.entrySet()) {
			System.out.println(str);
		}
	}
	
	public static void imprimeTamanhoMap(Map<Integer, String> strings) {
		System.out.println("Tamanho: " + strings.size());
	}
	
	public static void insereStringsMap(Map<Integer, String> strings) {
		strings.put(1, "String1");
		strings.put(2, "String1");
		strings.put(3, "String2");
		strings.put(4, "String2");
		strings.put(5, "String3");
		strings.put(6, "String3");
	}
}
