package com.javalec11.children;

import com.javalec11.papa.PapaPouch;

public class SecondChild {
	
	public SecondChild() {
		
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) {System.out.println("둘째는 돈이없어서 못받았어요");}
	}
}
