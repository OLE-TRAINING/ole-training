package bigdecimal;

import java.math.BigDecimal;

public class BigDecimalExercise {
	
	private BigDecimalExercise() {}

	// topic 2
	public static BigDecimal reverseSignOfANumber(BigDecimal bigDecimalNumber) {
		return bigDecimalNumber.multiply(new BigDecimal("-1"));
	}
	
	// topic 3
	public static BigDecimal getLargestNumber(BigDecimal number1, BigDecimal number2, BigDecimal number3) {
		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
			return number1;
		} else if (number2.compareTo(number3) > 0) {
			return number2;
		} else {
			return number3;
		}
	}
	
	public static BigDecimal getSmallestNumber(BigDecimal number1, BigDecimal number2, BigDecimal number3) {
		if (number1.compareTo(number2) < 0 && number1.compareTo(number3) < 0) {
			return number1;
		} else if (number2.compareTo(number3) < 0) {
			return number2;
		} else {
			return number3;
		}
	}
}