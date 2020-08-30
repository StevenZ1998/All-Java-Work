package com.skillstorm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skillstorm.beans.Person;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
		Person p = context.getBean(Person.class);
		p.write("Hello There.");
		
		Person p2 = context.getBean(Person.class);
		System.out.println(p);
		System.out.println(p2);
	}

}
