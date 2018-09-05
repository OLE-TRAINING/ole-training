import java.util.HashSet;
import java.util.Set;

public class Execute {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(20);
		hashSet.add(200);
		hashSet.add(30);
		hashSet.add(80);
		hashSet.add(40);
		hashSet.add(100);
		hashSet.add(200);

		int soma = 0;
		int cont = 0;
		for (Integer valor : hashSet) {
			System.out.println(valor);
			soma += valor;
			cont++;
		}
		System.out.println("Media=" + (float) soma / cont);
	}
}
