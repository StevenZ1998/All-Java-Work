package com.skillstorm.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.skillstorm.lifecycle")
public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
		context.getBean(Lion.class).wearHat();
		
		context.getBean(Lion.class).makeFriend();
		
		// context.registerShutdownHook();
		// context.close();
		
	}

}
