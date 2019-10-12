package com.javalec16.ex;

public class Main {

	public static void main(String[] args) {
		StarCar s1 = new StarCarLowGrade("블루","일반타이어",2000,"파워핸들");
		
		s1.getSpec();
		StarCar s2 = new StarCarHighGrade("레드","광폭타이어",2200,"파워핸들");
		s2.getSpec();
	}

}
