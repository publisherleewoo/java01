package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.setfNum(10);
//		myCalculator.setsNum(2);
//		myCalculator.setCalculator(new Calculator());
//		myCalculator.add();
//		myCalculator.min();
//		myCalculator.mul();
//		myCalculator.div();
		
		String configLocation= "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		//AbstractApplicationContext는 생성자 GenericXmlApplicationContext를 보아 추상클래스
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		 
		myCalculator.add();
	}
}
