package bigdecimal;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

public class ExecuteBigDecimal {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExecuteBigDecimal.class);
		
		// topic 1
		BigDecimal bd = new BigDecimal("0.1");
		logger.info(bd);
		
		// complementing topic 3
		logger.info("Largest: " + BigDecimalExercise.getLargestNumber(
				new BigDecimal("10"), new BigDecimal("50"), new BigDecimal("40")));
		
		logger.info("Smallest: " + BigDecimalExercise.getSmallestNumber(
				new BigDecimal("10"), new BigDecimal("50"), new BigDecimal("40")));
	}
}