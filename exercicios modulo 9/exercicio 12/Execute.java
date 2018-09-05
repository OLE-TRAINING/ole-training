import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();

		arrayList.add("String 1");
		arrayList.add("String 1");
		arrayList.add("String 2");
		arrayList.add("String 2");
		arrayList.add("String 3");
		arrayList.add("String 3");

		System.out.println("\n mostrando o vetor desordenado");
		Collections.shuffle(arrayList);
		show(arrayList);

		System.out.println("\n mostrando o vetor ordenado");
		Collections.sort(arrayList);
		show(arrayList);
	}

	public static void show(List<String> lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}
}