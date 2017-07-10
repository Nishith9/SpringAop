package org.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(public * getName())")
	public void LoggingAdvice() {
		//System.out.println("Advice run, get method called ");
		
	}
	
	@Before("args(name)")
	public void strMethods(String name) {
		System.out.println("The method is called, value is: "+name);
	}
	/*@After("args(name)")
	public void strMethods(String name) {
		System.out.println("The method is called, value is: "+name);
	}*/
	
	/*@Pointcut("execution(*get*())")
	public void allGetters(){}*/
	
	
}
