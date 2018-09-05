import java.util.HashMap;
import java.util.Map;

public class Execute {
	public static void main(String[] args) {
		Map<Integer, Integer> hashSet = new HashMap<Integer, Integer>();

		hashSet.put(1, 100);
		hashSet.put(2, 20);
		hashSet.put(3, 200);
		hashSet.put(4, 30);
		hashSet.put(5, 80);
		hashSet.put(6, 40);
		hashSet.put(7, 100);
		hashSet.put(8, 200);

		int soma = 0;
		for (int valor = 1; valor <= 8; valor++) {
			System.out.println(hashSet.get(valor));
			soma += hashSet.get(valor);
		}
		System.out.println("Media=" + (float) soma / 8);
	}
}