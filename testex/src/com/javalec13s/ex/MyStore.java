package com.javalec13s.ex;

public class MyStore extends HeadQuarterStore {
	@Override
	public void orderSunDaeGuk() {
		System.out.println("5000원 입니다");
	}
	@Override
	public void orderGongGibap() {
		// TODO Auto-generated method stub
		System.out.println("무료입니다");
	}
	
	@Override
	public void orderBiBimbap() {
		// TODO Auto-generated method stub
		super.orderBiBimbap();
	}
}
