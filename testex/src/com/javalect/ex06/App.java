package com.javalect.ex06;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManClass mc = new ManClass();
		ManClass mc2 = new ManClass(32,01024643333);
		
		System.out.println(mc2.getAge());
		
		WomanClass wc = new WomanClass();
		WomanClass wc1 = new WomanClass();
		
		System.out.println(wc.equals(wc1));
	}

}
