package bigdecimal;

import java.math.BigDecimal;

public class BigDecimalCalculator {

	private BigDecimalCalculator() {}
	
	// topic 4
	public static BigDecimal add(BigDecimal number1, BigDecimal number2) {
		return number1.add(number2);
	}
	
	public static BigDecimal subtract(BigDecimal number1, BigDecimal number2) {
		return number1.subtract(number2);
	}
	
	public static BigDecimal multiply(BigDecimal number1, BigDecimal number2) {
		return number1.multiply(number2);
	}
	
	public static BigDecimal divide(BigDecimal number1, BigDecimal number2) {
		return number1.divide(number2);
	}

	public static BigDecimal calculate(BigDecimal number1, BigDecimal number2, char op) {
		switch (op) {
		case '+':
			return add(number1, number2);
		case '-':
			return subtract(number1, number2);
		case '*':
			return multiply(number1, number2);
		case '/': 
			return divide(number1, number2);
		default:
			return null;
		}
	}
}
