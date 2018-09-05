import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < 200; i++) {
			arrayList.add("Bruno " + (Integer.toString(i + 1)));
			System.out.println(arrayList.get(i));
		}
	}
}
