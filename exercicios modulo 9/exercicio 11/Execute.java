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
		
		System.out.println("Mostrando o primeiro indice da ocorrencia de String 2 no arraylist:"+Collections.binarySearch(arrayList, "String 2"));		
	}
}
