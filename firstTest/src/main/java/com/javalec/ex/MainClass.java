package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
 

public class MainClass {

	public static void main(String[] args) {
 
		  
		String configLo = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLo);
		
//		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
//		
//		myCalculator.addM();
//		myCalculator.mulM();
		
		
		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
		myInfo.getInfo();
		ctx.close();
		
	}

}
