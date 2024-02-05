package com.springinaction.ch04.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

//	@Before("execution(** com.springinaction.ch04.concert.Performance.perform(..))")
//	public void silenceCellPhones() {
//		System.out.println("Silencing cell phones !!!");
//	}
//	
//	@Before("execution(** com.springinaction.ch04.concert.Performance.perform(..))")
//	public void takeSeats() {
//		System.out.println("Taking seats");
//	}
//	
//	@AfterReturning("execution(** com.springinaction.ch04.concert.Performance.perform(..))")
//	public void applause() {
//		System.out.println("CLAP CLAP CLAP!!!");
//	}
//	
//	@AfterThrowing("execution(** com.springinaction.ch04.concert.Performance.perform(..))")
//	public void demandRefund() {
//		System.out.println("Demanding a refund");
//	}
	
	@Pointcut("execution(** com.springinaction.ch04.concert.Performance.perform(..))")
	public void performance() {}
	
//	@Before("performance()")
//	public void silenceCellPhones() {
//		System.out.println("Silencing cell phones !!!");
//	}
//	
//	@Before("performance()")
//	public void takeSeats() {
//		System.out.println("Taking seats");
//	}
//	
//	@AfterReturning("performance()")
//	public void applause() {
//		System.out.println("CLAP CLAP CLAP!!!");
//	}
//	
//	@AfterThrowing("performance()")
//	public void demandRefund() {
//		System.out.println("Demanding a refund");
//	}
	
	@Around("performance()")
	public void watchperformance(ProceedingJoinPoint jp) {
		
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!! !!!!!!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
}
