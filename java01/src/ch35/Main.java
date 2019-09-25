package ch35;


interface Say{
	 void something();
}

class Person{
	public void greeting(Say line) {
		line.something();
	}
	
}

public class Main {
	public static void main(String[] args) {
	 
		Person lee = new Person();
		lee.greeting(new Say() {
			public void something() {
				System.out.println("my name is lee");
				System.out.println("헬");
			}
		});
		
		System.out.println("==========================");
		lee.greeting(()->{
			System.out.println("hi");
		});
	}
}
