package ch24;

public class Main {

	public static void main(String[] args) {
		short smallNum = 123;
		int normalNum =12345;
		long bigNum =123456789L;
		
		
		float floatNum =1.123f;
		double doubleNum = 1.123456789;
		
		int num = (int) bigNum;
		System.out.println(num);
		//String n = (String) smallNum //Err
		String n =  Integer.toString(smallNum);
		System.out.println(n);
	}

}
