package com.javalec12.parent;

public class Parent {
	public String pStr= "부모클래스";
	
	public Parent() {
		
	}
	
	public void getPapaName() {
		System.out.println("홍길동");
	}
	public void getMamaName() {
		System.out.println("유관순");
	}
	
	public void ovtg() {
		System.out.println("오버라이드될까?");
	}
	
}
