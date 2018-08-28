public class StringManipulation {
	public void showFourUpstring(String str) {
		System.out.println(str.substring(0, 4).toUpperCase());
	}

	public void hasNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3'
					|| str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7'
					|| str.charAt(i) == '8' || str.charAt(i) == '9') {
				System.out.println("tem numeros!!");
			}
		}
	}
}
