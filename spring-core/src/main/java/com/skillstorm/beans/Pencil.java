package com.skillstorm.beans;

import org.springframework.stereotype.Component;

@Component(value = "pencilpencil")
public class Pencil implements WritingUtensil {
	
	@Override
	public void write(String str) {
		System.out.println("Pencil : " + str);
	}
	
}
