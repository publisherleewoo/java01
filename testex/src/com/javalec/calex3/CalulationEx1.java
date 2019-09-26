package com.javalec.calex3;

import java.util.Scanner;

public class CalulationEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int result= (i % 3);
		System.out.println("i를 3으로 나누어서 나머지가 0이나오면 입력한 숫자는 3의배수입니다");
		
		System.out.println("i % 3 =" + result);
		
		if(result == 0) {
			System.out.println("i는 3의배수입니다");
		}else {
			System.out.println("i는 3의배수가 아닙니다");
		}
	}
}
