package com.javalec12.main;

import com.javalec12.child.Child;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child a = new Child();
		System.out.println("아버님이름");
		a.getPapaName();
		System.out.println("어머니이름");
		a.getMamaName();
		
		System.out.println(a.cStr);
		System.out.println(a.pStr);
		
		a.ovtg();
	}

}
