package bigdecimaltest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import bigdecimal.BigDecimalCalculator;

public class BigDecimalCalculatorTest {

	@Test
	public void testCalculateAdd() {
		assertEquals(new BigDecimal("7"),
				BigDecimalCalculator.calculate(new BigDecimal("4"), new BigDecimal("3"), '+'));
	}
	
	@Test
	public void testCalculateSubtract() {
		assertEquals(new BigDecimal("10"),
				BigDecimalCalculator.calculate(new BigDecimal("20"), new BigDecimal("10"), '-'));
	}
	
	@Test
	public void testCalculateMultiply() {
		assertEquals(new BigDecimal("10"),
				BigDecimalCalculator.calculate(new BigDecimal("5"), new BigDecimal("2"), '*'));
	}
	
	@Test
	public void testCalculateDivide() {
		assertEquals(new BigDecimal("20"),
				BigDecimalCalculator.calculate(new BigDecimal("80"), new BigDecimal("4"), '/'));
	}
	
	@Test
	public void testCalculateNull() {
		assertEquals(null, BigDecimalCalculator.calculate(new BigDecimal("80"), new BigDecimal("4"), '&'));
	}
}
