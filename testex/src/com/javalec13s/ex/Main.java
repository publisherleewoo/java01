package com.javalec13s.ex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyStore a = new MyStore();
		a.orderSunDaeGuk();
		a.orderGongGibap();
		a.orderBiBimbap();
		
		
		HeadQuarterStore store0 = new HeadQuarterStore();
		store0.orderBiBimbap();
		store0.orderBuDaejjige();
		store0.orderGongGibap();
		store0.orderKimChjjjige();
		store0.orderSunDaeGuk();
	
		System.out.println("==================");
		HeadQuarterStore store1 = new StoreNum1();
		store1.orderBiBimbap();
		store1.orderBuDaejjige();
		store1.orderGongGibap();
		store1.orderKimChjjjige();
		store1.orderSunDaeGuk();
		
		System.out.println("==================");
		HeadQuarterStore store2 = new StoreNum2();
		store2.orderBiBimbap();
		store2.orderBuDaejjige();
		store2.orderGongGibap();
		store2.orderKimChjjjige();
		store2.orderSunDaeGuk();
	
	}

}
