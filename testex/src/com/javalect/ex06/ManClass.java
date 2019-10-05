package com.javalect.ex06;

public class ManClass {
	private int age;
	private int phoneNum;
	
	public ManClass() {
		 
	}
	public ManClass(int age, int phoneNum) {
		 this.age = age;
		 this.phoneNum=phoneNum;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
}
