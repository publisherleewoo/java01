package ch14;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int result = cal.add(1, 3);
		System.out.println(result);
		
		User a = new User();
		a.setUserName("hi");
	 
		
		User b = new User("생성자메서드오버로딩");
	}

}
