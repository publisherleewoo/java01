package com.lec.ex3;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@PostConstruct
	public void init() {
		System.out.println("라이프사이클 시작");
	}
	
	@Bean
	public People kim(){  //kim이라는 빈객체
		People kim =new People();
	    	
		kim.setName("홍길동");
		kim.setAge(20);
		kim.setHeight(180);
		kim.setWeight(70);
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("축구");
		hobbys.add("농구");
		kim.setHobbys(hobbys);
	 
		return kim;
	}
	
	@PreDestroy
	public void end() {
		System.out.println("라이프사이클 종료");
	}
	
}
