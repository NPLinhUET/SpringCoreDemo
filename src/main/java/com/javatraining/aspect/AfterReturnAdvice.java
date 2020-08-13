package com.javatraining.aspect;

import org.aspectj.lang.JoinPoint;

public class AfterReturnAdvice{

	public void afterReturning(JoinPoint jp, Object returnValue) throws Throwable {
		// TODO Auto-generated method stub
		try {
			System.out.println(
					"After returning method " + jp.getSignature() +
					"\nResult: " + returnValue);
		} catch (Throwable e) {
			// TODO: handle exception
			throw e;
		}
	}

}
