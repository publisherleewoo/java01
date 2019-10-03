package com.javalec.ex05;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] Arr= {10,20,30,40,50};
		ArrayList ArrLi = new ArrayList();
		ArrLi.add("0");
		ArrLi.add("1");
		System.out.println(ArrLi);
		
		int[] jArr = new int[3];
		jArr[0]=1;
		jArr[1]=1;
		jArr[2]=1;
		
		
		int[] ArrR=Arr;
		for(int i = 0; i<Arr.length;i++) {
			System.out.println("Arr[i] : "+ Arr[i]);
			System.out.println("ArrR[i] : "+ArrR[i]);
		}
		
		Arr[0]=200;
		
		System.out.println(Arr[0]);
		System.out.println(ArrR[0]);
		
	}

}
