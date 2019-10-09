package com.javalec13.ex;

public class Child extends Parent {
	public Child() {}
	
	@Override
	public void method1() {
		System.out.println("차일드 메소드1");
	}
	
	@Override
	public void method2() {
		System.out.println("차일드 메소드2");
	}
}
