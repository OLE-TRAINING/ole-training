package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.apache.log4j.Logger;

public class ExecuteMethodReflection {
	private static final Logger logger = Logger.getLogger(ExecuteMethodReflection.class);

	// topic 6
	public static void main(String[] args) {
		Method[] methods = getAllMethods();
		printAllMethodsInfo(methods);	
	}
	
	public static Method[] getAllMethods() {
		return MethodReflection.class.getDeclaredMethods();
	}
	
	public static void printAllMethodsInfo(Method[] methods) {
		logger.info("Listing all methods:\n");
		for (Method method : methods) {
			logger.info("Name: " + method.getName());
			logger.info("Return type: " + method.getReturnType());
			
			logger.info("List of the method's params:");
			for (Parameter param : method.getParameters()) {
				logger.info(param.getType());
			}
			logger.info("End----\n");
		}
	}
}