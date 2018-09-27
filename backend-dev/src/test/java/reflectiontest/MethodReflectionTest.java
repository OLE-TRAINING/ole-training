package reflectiontest;

import static org.assertj.core.api.Assertions.assertThat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
	public void testDoWhatWithParamsIntegerParam() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method doWhatWithParams = MethodReflection.class.getDeclaredMethod("doWhatWithParams", Integer.class);
		Integer actual = (Integer) doWhatWithParams.invoke(this.methodReflection, 10);
		assertThat(actual).isEqualTo(10);
	}
	
	@Test
	public void testDoWhatWithParamsTwoIntegerParams() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method doWhatWithParams = MethodReflection.class.getDeclaredMethod("doWhatWithParams", Integer.class, Integer.class);
		String actual = (String) doWhatWithParams.invoke(this.methodReflection, 10, 20);
		assertThat(actual).isEqualTo("10, 20");
	}
	
	@Test
	public void testDoWhatWithParamsStringParams() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method doWhatWithParams = MethodReflection.class.getDeclaredMethod("doWhatWithParams", String.class);
		String actual = (String) doWhatWithParams.invoke(this.methodReflection, "10");
		assertThat(actual).isEqualTo("10"); 
	}
	
	@Test
	public void testDoWhatWithParamsNoParams() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method doWhatWithParams = MethodReflection.class.getDeclaredMethod("doWhatWithParams");
		Integer actual = (Integer) doWhatWithParams.invoke(this.methodReflection);
		assertThat(actual).isEqualTo(5); 
	}
	
	@Test
	public void testDoWhatWithParamsIntegerStringParams() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method doWhatWithParams = MethodReflection.class.getDeclaredMethod("doWhatWithParams", Integer.class, String.class);
		String actual = (String) doWhatWithParams.invoke(this.methodReflection, 10, "20");
		assertThat(actual).isEqualTo("20 10"); 
	}
	
	@Test
	public void testDoWhatWithParamsIntegerStringParamsNoSuchMethodException() throws SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		NoSuchMethodException e = null;
		try {
			MethodReflection.class.getDeclaredMethod("doWhawtWithParams", Integer.class, String.class);
		} catch (NoSuchMethodException e1) {
			e = e1;
		}
		assertThat(e).isNotNull(); 
	}
}