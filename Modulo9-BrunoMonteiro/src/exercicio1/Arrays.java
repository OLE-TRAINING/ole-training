package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		insereDuzentasStrings(strings);
	}

	// Exercício 1
	public static void insereDuzentasStrings(List<String> strings) {
		for (int i = 0; i < 200; i++) {
			strings.add("" + i);
		}
	}	
}
