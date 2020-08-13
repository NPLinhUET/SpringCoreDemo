package com.javatraining.aspect;

import org.aspectj.lang.JoinPoint;

public class AfterThrowAdvice{
	 public void afterThrowing(JoinPoint  jp, Exception e) throws Throwable {
	    System.out.println("throw advice method: " );
	  }

}
