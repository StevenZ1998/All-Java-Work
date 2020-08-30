package com.skillstorm.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.skillstorm.auto")
public class MainApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
		System.out.println(context.getBean(MyController.class));
		System.out.println(context.getBean(MyService.class));
		
		System.out.println(context.getBean(MyController.class).getService());
	}
}
