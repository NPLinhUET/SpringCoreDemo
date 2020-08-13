package com.javatraining.aspect;

import org.aspectj.lang.ProceedingJoinPoint; 

public class AroundAdvice {

	public Object around(ProceedingJoinPoint  pjp) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Around - before method " + pjp.getSignature());
		try {
			Object result = pjp.proceed();
			System.out.println(
					"Around - returning method " + pjp.getSignature() + 
					"\n Result: " + result);
			return result;
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Around - throw exception at: " + pjp.getSignature());
			throw e;
		}
	}

}
