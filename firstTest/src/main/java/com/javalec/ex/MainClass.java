package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		  
//		String configLo = "classpath:applicationCTX.xml";
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLo);

//		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
//		
//		myCalculator.addM();
//		myCalculator.mulM();

//		
//		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
//		myInfo.getInfo();
//		ctx.close();

//		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
//		studentInfo.getStudentInfo();
//		
//		Student student2 = ctx.getBean("student2",Student.class);
//		studentInfo.setStudent(student2);
//		studentInfo.getStudentInfo();
 
//		ctx.close();

		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Pancil pancil = ctx.getBean("pancil", Pancil.class);
		pancil.use();
		ctx.close();

	}

}
