package com.javalec.ex05;

import java.util.Scanner;

public class Main2 {
	public void multi(int a) {
		System.out.println("multi");
		for (int i = 1; i < 10; i++) {
			System.out.println(a + "x"+ i + "=" + (a*i));
		}	
	}
	  static void multi2(int a) {
		  System.out.println("=============multi2=============");
		  for (int i = 1; i < 10; i++) {
			System.out.println(a + "x"+ i + "=" + (a*i));
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		 
		Main2 a = new Main2();
		a.multi(num);
		
		
		multi2(num);
	}

}
