package com.javalec16.ex;

public class StarCarHighGrade extends StarCar{
	public Number tax= 20000;
	public StarCarHighGrade (String color,String tire,Number displacement,String handle) {
		super(color,tire,displacement,handle);
	}
	
	@Override
	public void getSpec() {
		System.out.println("StarCarHighGrade");
		System.out.println(this.color);
		System.out.println(this.tire);
		System.out.println(this.displacement);
		System.out.println(this.handle);
		System.out.println(this.tax);
		
	}

}
