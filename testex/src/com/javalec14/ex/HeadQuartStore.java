package com.javalec14.ex;

public abstract class HeadQuartStore {
	public void HeadQuartStore () {
		System.out.println("HeadQuartStore 컨스트럭터");
	}
	public void method1() {
		System.out.println("메소드1");
	}
	
	public abstract void orderKimchi();
	public abstract void orderSunDaeguk();
	public abstract void orderBiBimbab();

	
	
}
