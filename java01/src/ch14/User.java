package ch14;

public class User {
	String userName;
	
	public User() {
		this("아랫거까지실행");
		System.out.println("User생성자");	
	}
	public User(String a) {
		System.out.println("매개변수가 있는 User생성자" + a);
	}
	
	void setUserName(String userName) {
		this.userName = userName;
	}
	void getUserName() {
		System.out.println(userName);
		System.out.println(this.userName);
	}
}
