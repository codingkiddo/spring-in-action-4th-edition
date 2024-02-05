package com.springinaction.ch04.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConcertConfig.class);
		
		Performance performance = applicationContext.getBean(Performance.class);
		performance.perform();
		
		((AnnotationConfigApplicationContext)applicationContext).close();
		
	}

}
