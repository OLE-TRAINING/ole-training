import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("String 1");
		arrayList.add("String 1");

		arrayList.add("String 2");
		arrayList.add("String 2");

		arrayList.add("String 3");
		arrayList.add("String 3");

		for (String string : arrayList) {
			System.out.println(string);
		}
	}
}
