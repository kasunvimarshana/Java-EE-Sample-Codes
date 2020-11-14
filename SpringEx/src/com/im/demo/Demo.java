package com.im.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.im.draw.Shape;

public class Demo {

	public static void main(String[] args){
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
		
		Shape shape = (Shape)beanFactory.getBean("rectangle");
		
		System.out.println("Area was : " + shape.getArea());
		
	}
	
}
//right click on the project -> configure -> convert to maven project -> next and finish
//pom = Project Object Model

//solve maven pom error
//right click on the project -> properties -> java build path -> libraries ->
//JRE system library -> edit -> select alternate JRE -> installed JREs ->
//add -> select jdk 1.8 -> next and finish
//right click on the project -> maven -> update project (alt+f5) -> select update dependencies -> next and finish