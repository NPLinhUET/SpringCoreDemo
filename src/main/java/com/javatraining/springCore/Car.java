package com.javatraining.springCore;

public class Car{
	private String brand;
	
	public void init() {
		System.out.println("Car has been instantiated.");
	}
	public void destroy() {
		System.out.println("Car has been destroyed.");
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void drive() {
		System.out.println("Driving car...");
	}
}
