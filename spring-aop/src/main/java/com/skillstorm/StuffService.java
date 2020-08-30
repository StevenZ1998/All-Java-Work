package com.skillstorm;

import org.springframework.stereotype.Service;

@Service
public class StuffService {
	
	public void stuff() {
		System.out.println("stuff()");
	}
	
	public void doSomething() {
		System.out.println("doSomething()");
		
		double x = Math.random();
		if(x < 1) {
			// throw new RuntimeException("oops!");
		}
	}
	
	public String doSomething(int x, String s) {
		System.out.println(s + x);
		return s + x;
	}
	
	public int doSomething(int x) {
		System.out.println(x);
		return x;
	}
	
	public void doSomethingElse() {
		System.out.println("doSomethingElse()");
	}
	
	public void doWork() {
		System.out.println("doWork()");
	}
	
}
