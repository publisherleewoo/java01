package com.javalec13t.ex;

public class Child extends Parent{
	public Child() {
		System.out.println("ChildClass");
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("Child Class의 메서드1");
	}
}
