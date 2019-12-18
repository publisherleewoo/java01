package com.lec.ex2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1(){
		Student student1 = new Student("이름은");
		student1.setNum(20);
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("축구");
		hobbys.add("농구");
		student1.setHobbys(hobbys);
		return student1;
	}
	
	
	
	
}
