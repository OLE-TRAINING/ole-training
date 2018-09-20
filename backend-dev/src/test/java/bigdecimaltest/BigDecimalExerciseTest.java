package bigdecimaltest;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import bigdecimal.BigDecimalExercise;

public class BigDecimalExerciseTest {

	@Test
	public void testReverseSignOfANumberSuccess() {
		assertEquals(new BigDecimal("-10"), 
				BigDecimalExercise.reverseSignOfANumber(new BigDecimal("10")));
	}
	
	@Test
	public void testReverseSignOfANumberFail() {
		assertEquals(new BigDecimal("10"), 
				BigDecimalExercise.reverseSignOfANumber(new BigDecimal("10")));
	}
	
	@Test
	public void testGetLargestNumberFistNumberIsTheLargest() {
		assertEquals(new BigDecimal("3"),
				BigDecimalExercise.getLargestNumber(new BigDecimal("3"), 
						new BigDecimal("2"), new BigDecimal("1")));
	}
	
	@Test
	public void testGetLargestNumberSecondNumberIsTheLargest() {
		assertEquals(new BigDecimal("3"),
				BigDecimalExercise.getLargestNumber(new BigDecimal("2"), 
						new BigDecimal("3"), new BigDecimal("1")));
	}
	
	@Test
	public void testGetLargestNumberThirdNumberIsTheLargest() {
		assertEquals(new BigDecimal("3"),
				BigDecimalExercise.getLargestNumber(new BigDecimal("2"), 
						new BigDecimal("1"), new BigDecimal("3")));
	}
	
	@Test
	public void testGetSmallestNumberFirstNumberIsTheSmallest() {
		assertEquals(new BigDecimal("1"),
				BigDecimalExercise.getSmallestNumber(new BigDecimal("3"), 
						new BigDecimal("2"), new BigDecimal("1")));
	}
	
	@Test
	public void testGetSmallestNumberSecondNumberIsTheSmallest() {
		assertEquals(new BigDecimal("1"),
				BigDecimalExercise.getSmallestNumber(new BigDecimal("2"), 
						new BigDecimal("3"), new BigDecimal("1")));
	}
	
	@Test
	public void testGetSmallestNumberThirdNumberIsTheSmallest() {
		assertEquals(new BigDecimal("1"),
				BigDecimalExercise.getSmallestNumber(new BigDecimal("2"), 
						new BigDecimal("1"), new BigDecimal("3")));
	}
}