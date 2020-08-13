package com.javatraining.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatraining.aspect.AfterReturnAdvice;
import com.javatraining.services.Service;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        MyHouse myHouse = context.getBean("myHouse", MyHouse.class);
        
        myHouse.showHouse();
        
        Service sev = new Service();
        try {
	        sev.setMyHouse(myHouse);
	        sev.getCar();
//	        sev.throwException();
        } catch (Throwable e) {
			// TODO: handle exception
        	e.printStackTrace();
		}

        context.close();
    }
}
