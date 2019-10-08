package com.javalec11.startex;

import com.javalec11.children.FirstChild;
import com.javalec11.children.SecondChild;
import com.javalec11.children.ThirdChild;
import com.javalec11.papa.PapaPouch;

public class Main {

	public static void main(String[] args) {
		 FirstChild fc = new FirstChild();
		 fc.takeMoney(100);
		 System.out.println("첫째에게 주고 난 후의 아빠의 남은돈"+PapaPouch.MONEY);
		 SecondChild sc = new SecondChild();
		 sc.takeMoney(100);
		 System.out.println("둘째에게 주고 난 후의 아빠의 남은돈"+PapaPouch.MONEY);
		 ThirdChild tc = new ThirdChild();
		 tc.takeMoney(100);
		 System.out.println("아빠의 남은돈"+PapaPouch.MONEY);
	}

}
