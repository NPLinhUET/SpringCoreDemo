package com.javatraining.springCore;

public class MyHouse {
	Cat myKitty;
	Car myCar;
	
	public MyHouse(){}
	public void init() {
		System.out.println("My house has been instantiated.");
	}
	public void destroy() {
		System.out.println("My house has been destroyed.");
	}
	public Car getMyCar() {
		return myCar;
	}

	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}

	public Cat getMyKitty() {
		return myKitty;
	}

	public void setMyKitty(Cat myKitty) {
		this.myKitty = myKitty;
	};
	public void showHouse() {
		System.out.println(
				"My house has: " +
				"\n- A kitty named: "+myKitty.getName() +
				"\n- A car of "+myCar.getBrand());
	}
}
