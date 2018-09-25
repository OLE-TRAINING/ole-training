package reflection;

// topic 6
public class MethodReflection {
	
	public Integer doWhatWithParams(Integer num) {
		return num;
	}
	
	public String doWhatWithParams(Integer num1, Integer num2) {
		return num1 + ", " + num2;
	}
	
	public String doWhatWithParams(String string1) {
		return string1;
	}
	
	public Integer doWhatWithParams() {
		return 5;
	}
	
	public String doWhatWithParams(Integer num, String string) {
		return string + " " + num;
	}
}
