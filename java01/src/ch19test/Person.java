package ch19test;

public class Person implements getSpeak{

	
	int age;
	String name;

	 public Person() {
		System.out.println("펄슨컨스트럭터생성자");
	}
	
	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println("나이는 "+this.age+"살 입니다");
	}
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("이름은 "+this.name+"입니다");
	}

}
