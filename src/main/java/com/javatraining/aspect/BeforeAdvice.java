package com.javatraining.aspect;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice{
	public void before(JoinPoint jp) throws Throwable {
		try {
		System.out.println("Before method " + jp.getSignature());
		} catch (Throwable e) {
			// TODO: handle exception
			throw e;
		}
	}

}
