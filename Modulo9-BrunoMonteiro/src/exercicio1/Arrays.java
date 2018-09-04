package exercicio1;

import java.util.ArrayList;

public class Arrays {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		insereDuzentasStrings(strings);
	}

	// Exercício 1
	public static void insereDuzentasStrings(ArrayList<String> strings) {
		for (int i = 0; i < 200; i++) {
			strings.add("" + i);
		}
	}	
}
