package com.javalec.ex;

public class MyCalculator {
	private int fNum;
	private int sNum;
	private Calculator calculator;
	
	public int getfNum() {
		return fNum;
	}
	public void setfNum(int fNum) {
		this.fNum = fNum;
	}
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	public void add() {
		calculator.add(this.fNum,this.sNum);
	}
	
	public void min() {
		calculator.min(this.fNum,this.sNum);
	}
	
	public void mul() {
		calculator.mul(this.fNum,this.sNum);
	}
	
	public void div() {
		calculator.div(this.fNum,this.sNum);
	}
}
