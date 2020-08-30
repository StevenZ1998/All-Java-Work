package com.skillstorm.beans;

import org.springframework.stereotype.Component;

@Component(value = "penpen")
public class Pen implements WritingUtensil {
	
	@Override
	public void write(String str) {
		System.out.println("Pen : " + str);
	}
	
}
