import java.util.HashMap;
import java.util.Map;

public class Execute {

	public static void main(String[] args) {
		Map<Integer, String> hashMapExecute = new HashMap<Integer, String>();

		hashMapExecute.put(1, new String("String 1"));
		System.out.println("Valor da Chave " + 1 + " = " + hashMapExecute.get(1));

		hashMapExecute.put(1, new String("String 11"));
		System.out.println("Valor da Chave " + 1 + " = " + hashMapExecute.get(1));

		hashMapExecute.put(2, new String("String 2"));
		hashMapExecute.put(3, new String("String 2"));

		hashMapExecute.put(4, new String("String 3"));
		hashMapExecute.put(5, new String("String 3"));

		for (int i = 1; i <= 5; i++) {
			if (hashMapExecute.containsKey(i)) {
				System.out.println("Valor da Chave " + i + " = " + hashMapExecute.get(i));
			} else {
				System.err.println("Chave não existe");
			}
		}
	}
}
