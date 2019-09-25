package com.javalec.ex;

public class TestEx {
	public static void main(String[] args) {
            // 기본형은 값이 입력,   객체형은 주소값이 입력

			int i1 = 10;
			double d1 = i1;
			
			System.out.println("d1 : " + d1);
			
			double d2= 3.14;  //double가 메모리 넓이가 크다.  큰걸 작은 int에 넣으려하니 나머지는 없어지는것이다.
			int i2 = (int)d2;  //형변환
			
			System.out.println("i2 : " + i2);
		
	}
}
