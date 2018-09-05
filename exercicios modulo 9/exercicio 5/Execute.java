import java.util.ArrayList;
import java.util.List;

public class Execute {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();

		// 100, 20, 200, 30, 80, 40, 100, 200
		arrayList.add(100);
		arrayList.add(20);
		arrayList.add(200);
		arrayList.add(30);
		arrayList.add(80);
		arrayList.add(40);
		arrayList.add(100);
		arrayList.add(200);

		int soma = 0;
		int count = 0;
		for (int valor : arrayList) {
			System.out.println(valor);
			soma += valor;
			count++;
		}
		System.out.println("Media=" + (float) soma / count);
	}
}
