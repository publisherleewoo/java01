package ch02;
import java.util.Scanner;

public class Ex03test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = scan.next();
		System.out.println(name+"입니다");
		System.out.println("당신의 나이는?");
		int age = scan.nextInt();
		System.out.println(age+"입니다");
	}
}
