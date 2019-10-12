package com.javalec16.ex;

public abstract class StarCar {
	public String color;
	public String tire;
	public Number displacement;
	public String handle;
	
	
	public StarCar(String color,String tire,Number displacement,String handle) {
		this.color=color;
		this.tire=tire;
		this.displacement=displacement;
		this.handle=handle;
	}
	
	public abstract void getSpec();
}
