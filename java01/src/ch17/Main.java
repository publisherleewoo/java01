package ch17;


class Example{
	static String name ="Rin";
	
	static void showName() {
		System.out.println(name);
	}
}

public class Main {

	public static void main(String[] args) {
		 
		System.out.println(Example.name);  //객체화 시키지않아도 static이면 접근 가능하다.
		
		Example.showName();
		
		final int Id =1;
	//	Math.PI=100
		
		
		
//		class Math{
//			public static final double PI = 3.141592...;
//		}
	}

}
