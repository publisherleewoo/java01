package com.javalec16.ex;

public class StarCarLowGrade extends StarCar{
	public Number tax= 10000;
	public StarCarLowGrade (String color,String tire,Number displacement,String handle) {
		super(color,tire,displacement,handle);
	}
	
	@Override
	public void getSpec() {
		System.out.println("StarCarLowGrade");
		System.out.println(this.color);
		System.out.println(this.tire);
		System.out.println(this.displacement);
		System.out.println(this.handle);
		System.out.println(this.tax);
		
	}
}
