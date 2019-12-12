package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
//		 MyCalculator myCalculator = new MyCalculator();
//		 myCalculator.setCalculator(new Calculator());
//		 
//		 myCalculator.setFirstNum(10);
//		 myCalculator.setSecondNum(2);
//		 
//		 myCalculator.add();
//		 myCalculator.sub();
//		 myCalculator.mul();
//		 myCalculator.div();
	
		String configLocation= "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//AbstractApplicationContext는 생성자 GenericXmlApplicationContext를 보아 추상클래스
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}
}
