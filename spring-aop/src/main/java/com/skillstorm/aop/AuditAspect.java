package com.skillstorm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.skillstorm.StuffService;

@Component
@Aspect
public class AuditAspect {
	
	// @Before("execution(public void doSomething())")
	// @Before("execution(public * doSomething(*, *))")
	/* @Before("execution(public * doSomething*(..))")
	public void auditSomethingBefore1() {
		System.out.println("[@Before1]");
	}
	
	@Before("execution(public * doSomething(..))")
	public void auditSomethingBefore2(JoinPoint jp) {
		System.out.println("[@Before2] " + jp.getSignature());
		StuffService s = (StuffService) jp.getTarget();
	} */
	
	@Before(value = "hookMethod()")
	public void auditSomethingBefore3(JoinPoint jp) {
		System.out.println("[@Before3] " + jp.getSignature());
		StuffService s = (StuffService) jp.getTarget();
		System.out.println(s);
	}
	
	@After(value = "hookMethod()")
	public void auditSomethingAfter() {
		System.out.println("[@After]" );
	}
	
	@AfterThrowing(pointcut = "hookMethod()", throwing = "e")
	public void logException(Exception e) {
		System.out.println("[@AfterThrowing] ");
	}
	
	// @Pointcut("execution(public void doSomething())")
	// @Pointcut("execution(public int doSomething(*))")
	@Pointcut("within(com.skillstorm.StuffService)") // Every method within a class.
	public void hookMethod() {}
	
	@Around(value = "hookMethod()")
	public Object around(ProceedingJoinPoint jp) {
		
		Object returnValue = null;
		
		try {
			
			// Before
			System.out.println("Before Around");
			returnValue = jp.proceed();
			System.out.println("After Around");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return returnValue;
		// After
		
	}
	
}
