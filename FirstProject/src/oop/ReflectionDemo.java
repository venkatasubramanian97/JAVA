package oop;
import java.lang.reflect.*;
public class ReflectionDemo {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException  {
		Employee e=new Employee("Divya",60000);
	    Class cls=e.getClass();
		System.out.println("class name is : "+cls.getName());
		
		Method[] methods=cls.getMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		System.out.println(methods[0].invoke(e, null));
	}

}
