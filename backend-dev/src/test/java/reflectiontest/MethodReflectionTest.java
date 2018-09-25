package reflectiontest;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import reflection.MethodReflection;

public class MethodReflectionTest {

	private MethodReflection methodReflection;
	
	@Before
	public void initialize() {
		try {
			this.methodReflection = MethodReflection.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testDoWhatWithParamsIntegerParam() {
		try {
			assertThat(MethodReflection.class.getDeclaredMethod("doWhatWithParams", Integer.class)
					.invoke(this.methodReflection, 10)).isEqualTo(10);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testDoWhatWithParamsTwoIntegerParams() {
		try {
			assertThat(MethodReflection.class.getDeclaredMethod("doWhatWithParams", Integer.class, Integer.class)
					.invoke(this.methodReflection, 10, 20)).isEqualTo("10, 20");
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testDoWhatWithParamsStringParams() {
		try {
			assertThat(MethodReflection.class.getDeclaredMethod("doWhatWithParams", String.class)
					.invoke(this.methodReflection, "10")).isEqualTo("10");
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testDoWhatWithParamsNoParams() {
		try {
			assertThat(MethodReflection.class.getDeclaredMethod("doWhatWithParams")
					.invoke(this.methodReflection)).isEqualTo(5);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testDoWhatWithParamsIntegerStringParams() {
		try {
			MethodReflection.class.getDeclaredMethod("doWhatWithParams", Integer.class, String.class)
					.invoke(this.methodReflection, 10, "a");
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testDoWhatWithParamsIntegerStringParamsNoSuchMethodException() {
		try {
			MethodReflection.class.getDeclaredMethod("doWhatsWithParams", Integer.class, String.class)
					.invoke(this.methodReflection, 10, "a");
		} catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			assertThat(e.getMessage()).isEqualTo("reflection.MethodReflection.doWhatsWithParams(java.lang.Integer, java.lang.String)");
		}
	}
}
