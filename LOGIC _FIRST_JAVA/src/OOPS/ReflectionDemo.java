package OOPS;
import java.lang.reflect.*;
public class ReflectionDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException  {
		Employee e=new Employee("Divya",60000);
	    Class cls=e.getClass();
		System.out.println("class name is : "+cls.getName());
		
		Method[] methods=cls.getMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		System.out.println(extracted(e, methods));
	}

	private static char[] extracted(Employee e, Method[] methods) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
