package com.javatraining.services;

import com.javatraining.springCore.Car;
import com.javatraining.springCore.MyHouse;

public class Service {
	private MyHouse myHouse;
	
	public void setMyHouse(MyHouse myHouse) {
		this.myHouse = myHouse;
		System.out.println("My house set");
	}
	
	public MyHouse getMyHouse() {
		return myHouse;
	}

	public Car getCar() {
		return myHouse.getMyCar();
	}
	
//	public void throwException() throws Throwable{
//		throw new IllegalArgumentException();
//	}
}
