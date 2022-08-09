package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/springinaction/springidol/spring-idol-introductions.xml");
		
		Instrumentalist instrumentalist = (Instrumentalist) context.getBean("eddie");
		try {
			instrumentalist.perform();
		} catch (PerformanceException e) {
			System.out.println(e.getMessage());
		}
		
		( (ClassPathXmlApplicationContext) context).close();
	}

}
