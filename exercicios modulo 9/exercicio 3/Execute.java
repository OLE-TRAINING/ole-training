import java.util.HashSet;

public class Execute {

	public static void main(String[] args) {
		HashSet<String> hashList = new HashSet<String>();
		hashList.add("String 1");
		hashList.add("String 1");

		hashList.add("String 2");
		hashList.add("String 2");

		hashList.add("String 3");
		hashList.add("String 3");

		for (String string : hashList) {
			System.out.println(string);
		}
	}
}
