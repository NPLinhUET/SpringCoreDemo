package com.javatraining.springCore;

public class Cat{
	private String name;
	public void init() {
		System.out.println("Cat has been instantiated.");
	}
	public void destroy() {
		System.out.println("Cat has been destroyed.");
	}
	public Cat(String _name) {
		name = _name;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("Meow meow...");
	}
}
