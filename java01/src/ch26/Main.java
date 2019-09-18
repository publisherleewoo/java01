package ch26;

import java.util.ArrayList;

class Gen<T>{
	T somthing;
	public Gen() {
		System.out.println("컨스트럭터");
	}
	
	public void setSomthing(T value) {
		somthing = value;
	}
	
	public T getSomthing() {
		return somthing;
	}
}


public class Main {

	public static void main(String[] args) {
		 Gen<String> gen = new Gen<String>();
		 gen.setSomthing("테스트");
		 System.out.println(gen.getSomthing());
		 
		 Gen<Integer> gen2 = new Gen<Integer>();
		 gen2.setSomthing(34);
		 System.out.println(gen2.getSomthing());
	
		 
		 ArrayList<String> array = new ArrayList<String>();
		 array.add("바나나");
		 array.add("사과");
		 System.out.println(array);
	}
}
