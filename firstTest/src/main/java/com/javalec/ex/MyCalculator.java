package com.javalec.ex;

public class MyCalculator {
	private int a;
	private int b;
	private Calculator calculator;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void addM() {
		calculator.add(this.a,this.b);
	}
	 
	public void minM() {
		calculator.min(this.a,this.b);
	}
	 
	public void mulM() {
		calculator.mul(this.a,this.b);
	}
	
	public void divM() {
		calculator.div(this.a,this.b);
	} 
}
