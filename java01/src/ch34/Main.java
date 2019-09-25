package ch34;

class Person{
	public void greeting() {
		System.out.println("hello");
	};
	 
}

interface Utility{
	public void showInfo();
}


public class Main {

	public static void main(String[] args) {
		
		Person lee = new Person() {   //Person의 자식 익명클래스
			public void greeting() {
				System.out.println("my name is lee, nice to meet you");
			}
		};
		
		lee.greeting();
		
		Utility util = new Utility() {
			@Override
			public void showInfo() {
				System.out.println("showing info...");
				
			}
		};

	}

}
