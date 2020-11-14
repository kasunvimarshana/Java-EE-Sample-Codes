package com.im.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Analyzer {

	public static void analyze(Object object){
		//how to get class object from an object
		Class cls = object.getClass();
		
		//get the Name of the Class
		String name = cls.getName();
		System.out.println("Class Name = " + name);
		
		//get the Simple Name of the Class
		String simpleName = cls.getSimpleName();
		System.out.println("Simple Name = " + simpleName);
		
		//get the SuperClass of the Class
		Class superClass = cls.getSuperclass();
		String superClassName = superClass.getName();
		System.out.println("SuperClass Name = " + superClassName);
		String superClassSimpleName = superClass.getSimpleName();
		System.out.println("SuperClass Simple Name = " + superClassSimpleName);
		
		//get the SuperClass's SuperClass
		Class superClass1 = superClass.getSuperclass();
		String superClass1Name = superClass1.getName();
		String superClass1SimpleName = superClass1.getSimpleName();
		//get Class Modifiers
		int modifiers = cls.getModifiers();
		if(Modifier.isPublic(modifiers)){
			System.out.println("This Class is Public");
		}else{
			System.out.println("This Class is NOT Public");
		}
		
		//get Interfaces
		Class[] interfaces = cls.getInterfaces();
		for(Class in : interfaces){
			System.out.println("Interface = " + in.getSimpleName());
		}
		
		//get Declared Fields
		Field[] d_fields = cls.getDeclaredFields();
		for(Field field : d_fields){
			System.out.println("D Field Name = " + field.getName());
		}
		
		//get Fields
		Field[] fields = cls.getFields();
		for(Field field : fields){
			System.out.println("Field Name = " + field.getName());
		}
		
		//get Declared Methods
		Method[] d_methods = cls.getDeclaredMethods();
		for(Method method : d_methods){
			String n = method.getName();
			Type type = method.getGenericReturnType();
			System.out.println("D Method Name = " + n + " Return Type = " + type.getTypeName());
		}
		
		//get Methods
		Method[] methods = cls.getMethods();
		for(Method method : methods){
			String n = method.getName();
			Type type = method.getGenericReturnType();
			System.out.println("Method Name = " + n + " Return Type = " + type.getTypeName());
		}
		
	}
	
}
