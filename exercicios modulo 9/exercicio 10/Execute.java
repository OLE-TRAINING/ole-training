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

		Collections.shuffle(arrayList);
		for (String string : arrayList) {
			System.out.println(string);
		}
	}
}