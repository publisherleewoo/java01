class Foo{
	public static String classVar="I class var";
	public String instanceVar="I instance var";
	
	public static void classMethod() {
		System.out.println(classVar);
	}
	
	public void instanceMethod() {
		System.out.println(instanceVar);
	}
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		Foo.classMethod();
		
		Foo instanceFoo = new Foo();
		System.out.println(instanceFoo.classVar);
		System.out.println(instanceFoo.instanceVar);
		instanceFoo.instanceMethod();
	}

}
