package ch33;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		show(x);  //복사  pass by value
		System.out.println(x);
	}

	public static void show(int num) {
		num = 100;
		System.out.println(num);
	}
}
