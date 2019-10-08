package com.javalec.ex11;

public class Main {

	public static void main(String[] args) {
		
		Father f = new Father();
		f.money = f.money-100;
		System.out.println("남은돈"+f.money);

		
		Father f2 = new Father();
		f2.money = f2.money-100;
		System.out.println("남은돈"+f2.money);
		

	}

}
