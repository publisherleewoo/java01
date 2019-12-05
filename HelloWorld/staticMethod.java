class PrintClass{
	public static void a(String delimiter) {
		System.out.println(delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public static void b(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}


class PrintInstance{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}


public class staticMethod {

	public static void main(String[] args) {
		PrintClass.a("x");  //클래스 소속일때는 method가 static
		PrintClass.a("$");
	
		 PrintInstance t1 =	new PrintInstance();
		 t1.delimiter = "-";  //인스턴스 소속일때는 method가 no static
		 t1.a();
		 t1.b();
		 
		 PrintInstance t2 =	new PrintInstance();
		 t2.delimiter = "*";
		 t2.a();
		 t2.b();
	}
}
