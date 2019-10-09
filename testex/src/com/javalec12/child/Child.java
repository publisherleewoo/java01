package com.javalec12.child;

import com.javalec12.parent.Parent;

public class Child extends Parent {
	public String cStr ="아들클래스";
	public Child() {
		
	}
	
	@Override   //재정의
	public void ovtg() {
		System.out.println("오버라이드됌");
	}
	
	
}
