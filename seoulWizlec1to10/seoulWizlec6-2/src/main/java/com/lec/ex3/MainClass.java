package com.lec.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		 People kim = ctx.getBean("kim",People.class);
		 System.out.println(kim.getAge());
	}

}
