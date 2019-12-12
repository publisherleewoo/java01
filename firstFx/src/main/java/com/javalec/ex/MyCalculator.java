package com.javalec.ex;

public class MyCalculator {
	
	Calculator calculator;
	int firstNum;
	int secondNum;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public int getFirstNum() {
		return firstNum;
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	public int getSecondNum() {
		return secondNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add(){
		calculator.addition(firstNum,secondNum);
	}
	public void sub(){
		calculator.substraction(firstNum, secondNum);
	}
	public void mul(){
		calculator.multiplication(firstNum, secondNum);
	}
	public void div(){
		calculator.division(firstNum, secondNum);
	}
}
