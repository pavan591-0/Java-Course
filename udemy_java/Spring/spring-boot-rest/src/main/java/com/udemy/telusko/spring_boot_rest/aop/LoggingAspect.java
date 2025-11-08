package com.udemy.telusko.spring_boot_rest.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	//return type/*, fully_qualified_class_nmae.method/*(parameter/..)
	
	@Before("execution(* com.udemy.telusko.spring_boot_rest.service.JobService.*(..))")
	public void logMethodCall(JoinPoint jp) {
		LOGGER.info("method called " + jp.getSignature());
	}
	
	//@After is basically finally block
	@After("execution(* com.udemy.telusko.spring_boot_rest.service.JobService.returnAllJobPosts(..))"
			+ "|| execution(* com.udemy.telusko.spring_boot_rest.service.JobService.getJob(..))")
	public void logMethodExited(JoinPoint jp) {
		LOGGER.info("method exited " + jp.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.udemy.telusko.spring_boot_rest.service.JobService.returnAllJobPosts(..))"
			+ "|| execution(* com.udemy.telusko.spring_boot_rest.service.JobService.getJob(..))")
	public void logMethodExecuted(JoinPoint jp) {
		LOGGER.info("method executed " + jp.getSignature().getName());
	}


}
