package com.skillstorm.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.skillstorm.beans.Pen;
import com.skillstorm.beans.Pencil;
import com.skillstorm.beans.Person;
import com.skillstorm.beans.WritingUtensil;

@Configuration
public class HelloConfiguration {
	
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	/*
	 * Singleton Scope - Default Scope
	 * 
	 * */
	public Person getPerson() {
		Person p = new Person();
		p.setUtensil(getUtensil());
		return p;
	}
	
	@Bean
	public WritingUtensil getUtensil() {
		return new Pen();
	}
	
}
