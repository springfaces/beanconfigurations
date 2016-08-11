package com.caveofprogramming.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");
		Person person = (Person) context.getBean("person");
		/* you can you below statement if you want to avoid casting the Bean class */
		//Person perosn = context.getBean("person", Person.class);
		person.speak();
	}
}
