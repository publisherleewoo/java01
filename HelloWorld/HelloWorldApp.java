import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class HelloWorldApp {
	private static Scanner sn;

	public static void main(String[] args) {
		 String id = JOptionPane.showInputDialog("Enter a ID");
		 sn = new Scanner(System.in);	
		String name;
		String fname;
		System.out.println("당신의 이름은?");
		name = sn.next();
		System.out.println("당신의 성은?");
		fname = sn.next();
		System.out.println(id + "" + name + " " + fname + "님 안녕하세요");
	}
}