/* package com.skillstorm.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.skillstorm.StuffService;

@Configuration
@ComponentScan("com.skillstorm")
@EnableAspectJAutoProxy
public class MainApplication {
	
	public static void main(String[] args) {
		
		try {
			
			ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
			StuffService service = context.getBean(StuffService.class);
			
			service.stuff();
			service.doSomething();
			service.doSomething(5);
			service.doSomething(10, "Hello");
			service.doSomethingElse();
			service.doWork();
			
			} catch (Exception e) {e.printStackTrace();}

		
	}
	
} */
